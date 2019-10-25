package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {
    public static String randomString(int length){
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, true, useNumbers);
        return generatedString;
    }

    public static String randomEmail(){
        return randomString(8)+"@"+randomString(8)+".com";
    }

}
