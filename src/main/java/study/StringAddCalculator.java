package study;

import java.awt.AWTError;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {

  public static int splitAndSum(String text) {
    if(text == null || text.isEmpty()) return 0;

    List<String> textList = null;

    if(text.matches(".*[,|:].*")) textList = splitText(text);
    if(null == textList) textList = splitCustomKey(text);
    if(null == textList) return stringToInteger(text);

    List<Integer> numberList = textListToIntList(textList);
    return sumNumber(numberList);
  }

  private static List<String> splitText(String text) {
    return Arrays.asList(text.split("[,:]"));
  }

  private static int sumNumber(List<Integer> numberList) {
    return numberList.stream().reduce(0, Integer::sum);
  }

  private static List<Integer> textListToIntList(List<String> textList) {
   return textList.stream().map(StringAddCalculator::stringToInteger).collect(Collectors.toList());
  }

  private static int stringToInteger(String text) {
    int value = Integer.parseInt(text);
    if(value < 0) throw new RuntimeException();
    return value;
  }


  public static List<String> splitCustomKey(String text) {
    Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
    if(m.find()) {
      String[] tokens= m.group(2).split(m.group(1));
      return Arrays.asList(tokens);
    }
    return null;
  }

  public static void main(String[] args) {

    String text ="//;\n1;2;3";
    Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
    if (m.find()) {
      String customDelimiter = m.group(1);
      String[] tokens= m.group(2).split(customDelimiter);
      System.out.println(Arrays.asList(tokens));
    }

  }
}
