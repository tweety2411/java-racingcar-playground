package feedback;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {

  @Test
  void findWinners() {
    Car pobi = new Car("pobi", 4);
    Car crong = new Car("crong", 4);
    Car honux = new Car("honux", 2);

    List<Car> original = Arrays.asList(pobi, crong, honux);
    Cars cars = new Cars(original);
    assertThat(cars.findWinners()).containsExactly(pobi, crong);
  }
}
