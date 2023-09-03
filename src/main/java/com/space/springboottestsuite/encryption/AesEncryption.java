package com.space.springboottestsuite.encryption;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Slf4j
@RequiredArgsConstructor
public class AesEncryption {
    private final byte[] value;
    private final byte[] key;
    private final byte[] salt;

    public byte[] encrypt() {
        try {
            IvParameterSpec iv = new IvParameterSpec(salt);
            SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value);
            return encrypted;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
