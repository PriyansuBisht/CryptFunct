/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.cryptoProject.FunctionalClasses;


import com.cryptoProject.GUIFrames.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.security.SecureRandom;
import javax.imageio.ImageIO;

public class VisualCryptogrphyFunctions {
    // Create Share
    public static BufferedImage generateKey(int width, int height) {
        width *= 2;
        height *= 2;
        // generate empty key image
        BufferedImage key = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D keyGraphics = key.createGraphics();

        // fill it with a fully white
        keyGraphics.setColor(new java.awt.Color(255, 255, 255, 0));
        keyGraphics.fillRect(0, 0, width, height);

        // fill it with the random keys
        keyGraphics.setColor(new java.awt.Color(0, 0, 0, 255));
        
        SecureRandom secureRandom = new SecureRandom();
        
        // each 2x2-pixel-pack has 2 randomly set pixels
        for (int y = 0; y < height; y += 2) {
            for (int x = 0; x < width; x += 2) {
                // determine the two pixels
                int px1 = secureRandom.nextInt(4);
                int px2 = secureRandom.nextInt(4);
                while (px1 == px2) px2 = secureRandom.nextInt(4);

                // determine the coordinates of them
                int px1x = (px1 < 2) ? px1 : px1 - 2;
                int px1y = (px1 < 2) ? 0 : 1;
                int px2x = (px2 < 2) ? px2 : px2 - 2;
                int px2y = (px2 < 2) ? 0 : 1;

                // write them
                keyGraphics.fillRect(x + px1x, y + px1y, 1, 1);
                keyGraphics.fillRect(x + px2x, y + px2y, 1, 1);
            }
        }
        keyGraphics.dispose();

        return key;
    }


    public static BufferedImage loadAndCheckEncrFile(File keyFile) {
        if (keyFile == null) return null;
        BufferedImage imgKey = null;
        try {
                imgKey = ImageIO.read(keyFile);
        } catch (Exception e) {
                return null;
        }

        // check if width + height are divisable by 2
        if (imgKey.getWidth() % 2 != 0) return null;
        if (imgKey.getHeight() % 2 != 0) return null;

        // convert image to ARGB colorspace (if it isn't allready)
        if (imgKey.getType() != BufferedImage.TYPE_INT_ARGB) {
                BufferedImage raw_image = imgKey;
                imgKey = new BufferedImage(raw_image.getWidth(), raw_image.getHeight(), BufferedImage.TYPE_INT_ARGB);
                new ColorConvertOp(null).filter(raw_image, imgKey);
        }

        // check if image contains only black + transparent or white pixels
        // also count those
        long lAmountOfTotalPixels = 0;
        long lAmountOfBlackPixels = 0;

        for(int i = 0; i < imgKey.getHeight(); i++) {
                for(int j = 0; j < imgKey.getWidth(); j++) {
                        int iRgb = imgKey.getRGB(j, i);

                        // check if pixel is either fully transparent or black
                        if(iRgb>>>24 == 0) {
                                ++lAmountOfTotalPixels;
                        } else if (iRgb == java.awt.Color.BLACK.getRGB()) {
                                ++lAmountOfTotalPixels;
                                ++lAmountOfBlackPixels;
                        } else {
                                return null;
                        }

                }
        }
        if (lAmountOfTotalPixels / lAmountOfBlackPixels != 2) return null;

        return imgKey;
}


public static BufferedImage loadAndCheckSource(File sourceFile, int width, int height, boolean resize) {
        if (sourceFile == null) return null;
        BufferedImage imgSrc = null;
        try {
                imgSrc = ImageIO.read(sourceFile);
        } catch (Exception e) {
                return null;
        }

        // convert image to ARGB colorspace (if it isn't allready)
        if (imgSrc.getType() != BufferedImage.TYPE_INT_ARGB) {
                BufferedImage raw_image = imgSrc;
                imgSrc = new BufferedImage(raw_image.getWidth(), raw_image.getHeight(), BufferedImage.TYPE_INT_ARGB);
                new ColorConvertOp(null).filter(raw_image, imgSrc);
        }


        // resize image
        if (!resize || (imgSrc.getWidth() == width && imgSrc.getHeight() == height)) return imgSrc;
        BufferedImage imgSrcRes =  new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g = imgSrcRes.createGraphics();
        int x = (width - imgSrc.getWidth()) / 2;
        int y = (height - imgSrc.getHeight()) / 2;
        g.drawImage(imgSrc, x, y, imgSrc.getWidth() + x, imgSrc.getHeight() + y, 0, 0, imgSrc.getWidth(), imgSrc.getHeight(), null);
        g.dispose();

        return imgSrcRes;
    }


    public static BufferedImage encryptImage(BufferedImage imgKey, BufferedImage imgSrc) {
        if (imgKey == null || imgSrc == null) return null;
        
        // check for key/source file match
        if (imgSrc.getWidth() != imgKey.getWidth() / 2 || imgSrc.getHeight() != imgKey.getHeight() / 2) return null;

        // resize the source to the size of the key
        BufferedImage imgSrcRes =  new BufferedImage(imgKey.getWidth(), imgKey.getHeight(), BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g = imgSrcRes.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        g.drawImage(imgSrc, 0, 0, imgKey.getWidth(), imgKey.getHeight(), 0, 0, imgSrc.getWidth(), imgSrc.getHeight(), null);
        g.dispose();

        BufferedImage imgEncr =  new BufferedImage(imgKey.getWidth(), imgKey.getHeight(), BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D encrGraphics = imgEncr.createGraphics();

        // fill it with a fully transparent white
        encrGraphics.setColor(new java.awt.Color(255, 255, 255, 0));
        encrGraphics.fillRect(0, 0, imgEncr.getWidth(), imgEncr.getHeight());

        // encrypt
        encrGraphics.setColor(new java.awt.Color(0, 0, 0, 255));

        
        for (int y = 0; y < imgEncr.getHeight(); y += 2) {
            for (int x = 0; x < imgEncr.getWidth(); x += 2) {
                // 1x1 to 2x2
                if (imgSrcRes.getRGB(x, y) == java.awt.Color.BLACK.getRGB()) {
                    // write the two pixels to complete the block together with the key
                    if (imgKey.getRGB(x, y)>>>24 == 0) encrGraphics.fillRect(x, y, 1, 1);
                    if (imgKey.getRGB(x + 1, y)>>>24 == 0) encrGraphics.fillRect(x + 1, y, 1, 1);
                    if (imgKey.getRGB(x, y + 1)>>>24 == 0) encrGraphics.fillRect(x, y + 1, 1, 1);
                    if (imgKey.getRGB(x + 1, y + 1)>>>24 == 0) encrGraphics.fillRect(x + 1, y + 1, 1, 1);
                } else {
                    // write the two pixels at the same position in the key
                    if (imgKey.getRGB(x, y) == java.awt.Color.BLACK.getRGB()) encrGraphics.fillRect(x, y, 1, 1);
                    if (imgKey.getRGB(x + 1, y) == java.awt.Color.BLACK.getRGB()) encrGraphics.fillRect(x + 1, y, 1, 1);
                    if (imgKey.getRGB(x, y + 1) == java.awt.Color.BLACK.getRGB()) encrGraphics.fillRect(x, y + 1, 1, 1);
                    if (imgKey.getRGB(x + 1, y + 1) == java.awt.Color.BLACK.getRGB()) encrGraphics.fillRect(x + 1, y + 1, 1, 1);
                }
            }
        }
        encrGraphics.dispose();

        return imgEncr;
    }

    // overlay
    
    public static BufferedImage overlayImages(BufferedImage imgKey, BufferedImage imgEnc) {
        if (imgKey == null || imgEnc == null || imgKey.getWidth() != imgEnc.getWidth() || imgKey.getHeight() != imgEnc.getHeight()) return null;

        // copy key to image
        BufferedImage imgOverlay =  new BufferedImage(imgKey.getWidth(), imgKey.getHeight(), BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g = imgOverlay.createGraphics();
        g.drawImage(imgKey, 0, 0, imgKey.getWidth(), imgKey.getHeight(), 0, 0, imgKey.getWidth(), imgKey.getHeight(), null);

        // impose the encrypted image on it
        g.drawImage(imgEnc, 0, 0, imgEnc.getWidth(), imgEnc.getHeight(), 0, 0, imgEnc.getWidth(), imgEnc.getHeight(), null);

        g.dispose();

        return imgOverlay;
    }


    public static BufferedImage decryptImage(BufferedImage imgKey, BufferedImage imgEnc) {
        return decryptImage(overlayImages(imgKey, imgEnc));
    }


    public static BufferedImage decryptImage(BufferedImage imgOverlay) {
        if (imgOverlay == null || imgOverlay.getHeight() % 2 != 0 || imgOverlay.getWidth() % 2 != 0) return null;

        BufferedImage imgClean = new BufferedImage(imgOverlay.getWidth() / 2, imgOverlay.getHeight() / 2, BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D cleanGraphics = imgClean.createGraphics();

        cleanGraphics.setColor(new java.awt.Color(255, 255, 255, 0));
        cleanGraphics.fillRect(0, 0, imgClean.getWidth(), imgClean.getHeight());

        // fill it with the cleaned up picture
        cleanGraphics.setColor(new java.awt.Color(0, 0, 0, 255));

        // go through the picture and write all fully colored 2x2 blocks to the result picture
        for (int yOver = 0, yCln = 0; yOver < imgOverlay.getHeight(); yOver += 2, ++yCln) {
            for (int xOver = 0, xCln = 0; xOver < imgOverlay.getWidth(); xOver += 2, ++xCln) {
                if (imgOverlay.getRGB(xOver, yOver) == java.awt.Color.BLACK.getRGB() &&
                    imgOverlay.getRGB(xOver + 1, yOver) == java.awt.Color.BLACK.getRGB() &&
                    imgOverlay.getRGB(xOver, yOver + 1) == java.awt.Color.BLACK.getRGB() &&
                    imgOverlay.getRGB(xOver + 1, yOver + 1) == java.awt.Color.BLACK.getRGB()) {
                    cleanGraphics.fillRect(xCln, yCln, 1, 1);
                }
            }
        }
        cleanGraphics.dispose();
        return imgClean;
    }
}
