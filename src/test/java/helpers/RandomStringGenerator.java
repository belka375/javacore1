package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {
    //this class for generate random user and email

    //random string java


    public static String randomString(int length){

        boolean userNumbers = false;
        String generatedString = RandomStringUtils.random(length, true, userNumbers);
        return generatedString;
    }
    public static String randomEmail(){
        return randomString(8)+"@"+randomString(8)+".com";
    }
}
