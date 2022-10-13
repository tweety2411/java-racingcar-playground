package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringAddCalculator2Test {
  StringAddCalculator2 calculator;

  @BeforeEach
  void setUp() {
    calculator = new StringAddCalculator2();
  }

  @Test
  void usedCustomSepTest() {
    String text = "//;\n";
    boolean result = calculator.usedCustomSeparator(text);
    assertThat(result).isTrue();
  }

  @Test
  void splitCustomText() {
    String text = "//;\n1;2;3";
    String[] arr = calculator.splitText(text);
    assertThat(arr.length).isEqualTo(3);
  }

  @Test
  void split1Text() {
    String text = "2";
    String[] arr = calculator.splitText(text);
    assertThat(arr.length).isEqualTo(1);
  }

  @Test
  void parseNumber(){
    String text = "-9";
    int result = calculator.parseNumber(text);
    assertThat(result).isBetween(0, 9);
  }

  @Test
  void parseNumberException() {
    assertThatThrownBy(()-> calculator.parseNumber("a"))
        .isInstanceOf(RuntimeException.class);
  }

  @Test
  void calculator() {
    String text = "6";
    int result = calculator.calculator(text);
    assertThat(result).isEqualTo(6);

    String finalText = "-1";
    assertThatThrownBy(()->calculator.calculator(finalText)).isInstanceOf(RuntimeException.class);
  }
}