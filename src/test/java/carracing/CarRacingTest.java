package carracing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarRacingTest {

  private CarRacing carRacing;

  @BeforeEach
  void setUp() {
    carRacing = new CarRacing();
    String carNames = "pobi,crong,honux";
    carRacing.splitCars(carNames);
  }

  @Test
  void generateRandomNumber() {
    int number = carRacing.generateRandomNumber();
    assertThat(number).isBetween(0, 9);
  }

  @Test
  void getRandomNumber() {
    carRacing.carsRandomNumber();
  }

  @Test
  void racing() {
    int tryCount = 5;
    carRacing.race(tryCount);
  }
}
