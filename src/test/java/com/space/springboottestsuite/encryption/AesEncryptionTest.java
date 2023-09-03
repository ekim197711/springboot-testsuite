package com.space.springboottestsuite.encryption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HexFormat;

class AesEncryptionTest {
    String secretMessage = "Programming is fun! And the cloud is awesome and scalable";
    String key = "qwerty1234123456";
    String salt = "pebber7890123456";

    @Test
    void encrypt() {
        byte[] encrypt = new AesEncryption(secretMessage.getBytes(), key.getBytes(), salt.getBytes())
                .encrypt();
        String hexEncrypt = HexFormat.of().formatHex(encrypt);
        System.out.println(hexEncrypt);
        Assertions.assertEquals("b7afd92d310d52f019f977c38e59e062c8e93fd323cb6b5987ac8c3165d0991b9654606282fec7dea3dd8515da26fc33ec37b1c698d5f03f7fd1b794b5d4ba3c",
                hexEncrypt);
    }

    @Test
    void decryptMessage() {
        String alreadyEncryped = "b7afd92d310d52f019f977c38e59e062c8e93fd323cb6b5987ac8c3165d0991b9654606282fec7dea3dd8515da26fc33ec37b1c698d5f03f7fd1b794b5d4ba3c";
        byte[] bytes = HexFormat.of().parseHex(alreadyEncryped);
        byte[] decrypt = new AesDecryption(bytes, key.getBytes(), salt.getBytes()).decrypt();
        System.out.println(new String(decrypt));
        Assertions.assertEquals(secretMessage, new String(decrypt));

    }

}