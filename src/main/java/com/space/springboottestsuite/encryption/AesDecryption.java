package com.space.springboottestsuite.encryption;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Slf4j
@RequiredArgsConstructor
public class AesDecryption {
    private final byte[] message;
    private final byte[] secretKey;
    private final byte[] salt;

    public byte[] decrypt() {
        try {
            IvParameterSpec iv = new IvParameterSpec(salt);
            SecretKeySpec skeySpec = new SecretKeySpec(secretKey, "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(message);
            return original;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
