package pages;

import org.apache.commons.lang.RandomStringUtils;



public class HelperClass
{

    public static String generateString(int length) {
      String randomAlphabetic = RandomStringUtils.randomAlphabetic(length);
      return randomAlphabetic;
    }
    public static String getRandomNumber(int length) {
        String randomNumeric = RandomStringUtils.randomNumeric(length);
        return randomNumeric;
    }
}
