package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class CreatingRandomUserCredentials {

    public static String randomString(int length) {
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, true, useNumbers);
        return generatedString;
    }

    public static String randomEmail() {
        return randomString(10) + "@" + randomString(5) + ".com";
    }
    public static String randomUsername() {
        return randomString(5) + "User";
    }
    public static String randomPassword(){
        return randomString(5)+"Password";
    }
}
