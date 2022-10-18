package feedback;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  private final List<Car> cars;

  public Cars(List<Car> cars) {
    this.cars = cars;
  }


  public List<Car> findWinners() {
    Position maxPosition = getMaxPosition();
    return findWinners(maxPosition);
  }


  private List<Car> findWinners(Position maxPosition) {
    List<Car> winners = new ArrayList<>();
    for(Car car : cars) {
      if(car.isWinner(maxPosition)){
        winners.add(car);
      }
    }
    return winners;
  }
  private Position getMaxPosition() {
    Position maxposition = new Position();
    for(Car car : cars) {
      maxposition = car.getMaxposition(maxposition);
    }
    return maxposition;
  }
}
