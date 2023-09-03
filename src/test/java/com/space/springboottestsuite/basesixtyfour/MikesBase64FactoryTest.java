package com.space.springboottestsuite.basesixtyfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class MikesBase64FactoryTest {

    @Test
    void tryTheFactory() {
        String souceString = """
                An open letter is a letter that is intended to be read by a wide audience, or a letter intended for an individual, but that is nonetheless widely distributed intentionally.[1][2][3]
                                
                Open letters usually take the form of a letter addressed to an individual but are provided to the public through newspapers and other media, such as a letter to the editor or blog.[4] Critical open letters addressed to political leaders are especially common.
                                
                Letters patent are another form of an open letter in which a legal document is mailed to a person by a government and publicized so that all are made aware of it. Open letters can also be addressed directly to a group rather than individuals.[citation needed]
                                
                Two of the most famous and influential open letters are J'accuse...! by Émile Zola to the President of France, accusing the French government of wrongfully convicting Alfred Dreyfus for alleged espionage, and Martin Luther King Jr.'s Letter from Birmingham Jail, including the famous quotation "Injustice anywhere is a threat to justice everywhere".[5]
                """;
        String encode = new MikesBase64Factory(souceString).encode();
        System.out.println(encode);
        String decoded = new String(new MikesBase64Factory(encode).decode(), StandardCharsets.UTF_8);

        Assertions.assertEquals(souceString, decoded);
    }

    @Test
    void encode() {
        String source = "Hello my name is Mike! ____======= ÅÆØåæø Test 1 2 3 ///+-";
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        String standardBase64Encoding = encoder.encodeToString(source.getBytes(StandardCharsets.UTF_8));
        String urlencoded = urlEncoder.encodeToString(source.getBytes(StandardCharsets.UTF_8));
        System.out.println(standardBase64Encoding);
        System.out.println(urlencoded);
    }

    @Test
    void decode() {
    }
}