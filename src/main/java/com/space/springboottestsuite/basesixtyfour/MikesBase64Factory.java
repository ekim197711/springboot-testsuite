package com.space.springboottestsuite.basesixtyfour;

import lombok.RequiredArgsConstructor;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RequiredArgsConstructor
public class MikesBase64Factory {
    private final String sourceOrTarget;
    private final Charset ENCODING = StandardCharsets.UTF_8;

    public String encode() {
        return Base64.getUrlEncoder().encodeToString(sourceOrTarget.getBytes(ENCODING));
    }

    public byte[] decode() {
        return Base64.getUrlDecoder().decode(sourceOrTarget);
    }

}
