package feedback;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

  @Test
  void 이동() {
    Car car = new Car("pli", 2);
//    car.move(4);
    car.move(() -> true);
//    assertThat(car.getPosition()).isEqualTo(1);
  }

  @Test
  void 정지() {
    Car car = new Car("hey", 2);
//    car.move(3);
    //lamda로 변환 가능
    car.move(new MovingStrategy() {
      @Override
      public boolean movable() {
        return false;
      }
    });
//    assertThat(car.getPosition()).isEqualTo(0);
  }

}
