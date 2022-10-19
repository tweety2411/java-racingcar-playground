package racingcar.domain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

  private RacingCar rc;

  @BeforeEach
  void setUp() {
    rc = new RacingCar("a,b,c",3);
  }

  @Test
  void race() {
    rc.race();
//    assertThat(rc.getTryNo()).isEqualTo(2);
  }

  @Test
  void tryRaceTest() {
    for(int i= 0; i < 3; i++) {
      rc.race();
      System.out.println();
    }

  }
}
