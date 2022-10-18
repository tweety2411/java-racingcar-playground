package feedback;
import java.util.Objects;
import java.util.Random;

public class Car {

  private static final int FORWARD_NUM = 4;
  private static final int MAX_BOUNT = 10;
  private final Name name;
  private Position position;

  public Car(String name) {
    this(name, 0);
  }

  public Car(String name, int position) {
    this.name = new Name(name);
    this.position = new Position(position);
  }

  public boolean isWinner(Position maxPosition) {
//    return this.position.isSame(maxPosition.);
    return true;
  }
  public void move(MovingStrategy movingStrategy) {
  }

  public void move(int randomNo) {
  }

  public void move() {
    if(getRandomNo() >= FORWARD_NUM){
      position = position.move();
    }
  }

  private int getRandomNo() {
    return new Random().nextInt(MAX_BOUNT);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(name, car.name) && Objects.equals(position,
        car.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position);
  }

  public Position getMaxposition(Position maxposition) {
    if(position.lessThan(maxposition)) {
      return maxposition;
    }
    return this.position;
  }
}
