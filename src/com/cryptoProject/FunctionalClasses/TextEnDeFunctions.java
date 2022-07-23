/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cryptoProject.FunctionalClasses;



import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.BadPaddingException;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Priyansu
 */
public class TextEnDeFunctions {
    
    public static String encryptText( String plainText , SecretKey secretKey , int size , IvParameterSpec IV) throws NoSuchAlgorithmException, NoSuchPaddingException, 
    InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        String x = null;
        try {
            x = encrypt("AES/CBC/PKCS5Padding", plainText, secretKey, IV);
        } catch (BadPaddingException | IllegalBlockSizeException ex) {
            Logger.getLogger(TextEnDeFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    public static String decryptText( String cypherText , SecretKey secretKey , int size , IvParameterSpec IV) throws NoSuchAlgorithmException, NoSuchPaddingException, 
    InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        String x = null;
        try {
            x = decrypt("AES/CBC/PKCS5Padding", cypherText, secretKey, IV);
        } catch (BadPaddingException | IllegalBlockSizeException ex) {
            Logger.getLogger(TextEnDeFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    public static String encrypt(String algorithm, String input, SecretKey key, IvParameterSpec iv)
    throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
    InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    Cipher cipher = Cipher.getInstance(algorithm);
    cipher.init(Cipher.ENCRYPT_MODE, key, iv);
    byte[] cipherText = cipher.doFinal(input.getBytes());
    return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String decrypt(String algorithm, String cipherText, SecretKey key, IvParameterSpec iv)
        throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
        InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(plainText);
    }
    
    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        SecretKey key = keyGenerator.generateKey();
        return key;
    }

//    public static IvParameterSpec generateIv() {
//        byte[] iv = new byte[16];
//        new SecureRandom().nextBytes(iv);
//        java.io.FileOutputStream writeIV;
//        try {
//            writeIV = new java.io.FileOutputStream(new java.io.File("IVFile"));
//            java.io.BufferedOutputStream writeIv = new java.io.BufferedOutputStream( writeIV );
//            try {
//                writeIv.write(iv);
//                writeIv.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TextEnDeFunctions.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TextEnDeFunctions.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//        return new IvParameterSpec(iv);
//    }
    
   
//    public static void main( String[] args ) throws Exception {
//        String s = "Hello my name is  priyansu";
//        int n = 256;
//        SecretKey k = generateKey(n);
//        SecretKey k1 = k;
//        IvParameterSpec IV = generateIv();
//        IvParameterSpec IV1 = IV;
//        String x = encrypt("AES/CBC/PKCS5Padding", s, k, IV);
//        System.out.println(x);
//        String y = decrypt("AES/CBC/PKCS5Padding", x, k1, IV1);
//        System.out.println(y);
//    }
   
}


//  /bmtT0evfsBjbDd4LwU7yDRW828UZ2EYqfCVNIa7WYPm1RPKyd5ZyDCjDsIrbmCtYUveWIoG5JD2Pmtldm5MiFiWgspeWm/ilg3QCz1JIj6qbEJ9UrwOaFU7mOmasDgwiygWUdInsUcyUMpCySkebtGUz0wxZ0rYo09ABquaiv8M3lx9lTFex/2NvHx0xc2g8ydjVLIcfinLnBgcln4/h/gIms4h7o5KrgRVPD1cwYpdjd8O/I2bMgTiGOOUsjTmy9ep/tWvRjZ2FyaGbh7lVF/a7FyMDMoX93YK8ymotMMfdg46JU0fOKAdpfeQNy9TXwUuP+ERTW5tQ6OAoEAguyYd6AZLKJLyLwoszrWEpAIeLMFRphvER5MeQ5S0l5oelonv96rK9TsIvwY///P1n7BlaPDjQS87Q11DbO3EEa16dGdQJJt2f+vSnKyvEhF0hsPpOStCUK2zzeg6Uau2CoF8iN39ukeaaaJuUQx83AZtCeCWoWEtRfxtNjUz4Eg8XN7WHvOCKjqK0i1mnaWOpmn7eMlkgbLJjX24mjmTuF4UNEe/MPfifHQuvwp40WHyRnLVkfrY+RFIIN9y9zyZTlPZezYfDyczQGVxQW0YzL5A4XBEltWYJN42WNAjwas4QngfO0SwkDvBgDs8Ln7RCg==

//  key
//  9ln6eyZVYAa7AuQaaRXFvewxFTlUFE9Qtr243u6K75E