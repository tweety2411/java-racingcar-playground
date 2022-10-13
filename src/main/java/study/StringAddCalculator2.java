package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator2 {

  private static final String CUSTOM_PATTERN = "//(.)\n(.*)";

  public int calculator(String text) {
    int result = 0;
    for(String txt : splitText(text)) {
      result += parseNumber(txt);
    }
    return result;
  }

  public String[] splitText(String text) {
    String seperator = ",|:";
    if(null == text || text.isEmpty()) return new String[]{"0"};

    if(usedCustomSeparator(text)) {
      seperator = findSeparator(text);
      text = text.substring(4);
    }

    return text.split(seperator);
  }

  private String findSeparator(String text) {
    Matcher m = Pattern.compile(CUSTOM_PATTERN).matcher(text);
    if(m.find()) return m.group(1);
    return null;
  }

  public boolean usedCustomSeparator(String text) {
    return text.matches(CUSTOM_PATTERN);
  }

  public int parseNumber(String text) {
    int num;
    try {
      num = Integer.parseInt(text);
      if(num < 0) throw new RuntimeException();
    } catch (NumberFormatException e) {
      throw new RuntimeException();
    }
    return num;
  }
}
