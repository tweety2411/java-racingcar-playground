package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ResultViewTest {

  @Test
  void printRaceTest() {
    /*for (Car car : cars) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < car.getPosition(); i++) {
        sb.append("-");
      }
      System.out.println(car.getName() + " : " + sb);
    }*/

   List<Car> carList = Arrays.asList(new Car("a",new Position(1)), new Car("b", new Position(2)), new Car("c", new Position(3)));
  }
}