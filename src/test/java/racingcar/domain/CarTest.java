package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarTest {

  @Test
  void CarNameTest() {
    Car car = new Car("pli");
    assertThat(car).isEqualTo(new Car("pli"));

    assertThatThrownBy(()->new Car("")).isInstanceOf(IllegalArgumentException.class);
    assertThatThrownBy(()->new Car("abcdef")).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void CarsNameTest() {
    Cars cars = new Cars("a,b,c");
    assertThat(cars.getList().size()).isEqualTo(3);
  }

  @Test
  void carMoveTest() {
    Car car = new Car("a");
    car.move();

    assertThat(car).isEqualTo(new Car("a", new Position(1)));
  }

  @Test
  void findWinners() {
    Cars cars = new Cars("a,b,c");
    cars.findWinners();
  }
}
