package carracing;

public class Car {

  private String name;
  private String position;

  public Car(String name, String position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        '}';
  }
}
