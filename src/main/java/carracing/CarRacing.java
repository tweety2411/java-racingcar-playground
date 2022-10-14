package carracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class CarRacing {

  private List<Car> cars;

  public void splitCars(String carNames) {
    cars = new ArrayList<>();
    for(String car : carNames.split(","))
      cars.add(checkCarNameLength(car.trim()));
  }

  private Car checkCarNameLength(String carName) {
    if(carName.length() > 5)
      throw new RuntimeException("자동차 이름은 5글자를 초과할 수 없습니다.");
    return new Car(carName, "");
  }


  public int generateRandomNumber() {
    return new Random().nextInt(10);
  }

  public void race(int count) {
    for(int i = 0; i < count; i++) {
      carsRandomNumber();
    }

    List<String> winners = findWinner();
    System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
  }

  private List<String> findWinner() {
    int max = cars.stream().map(Car::getPosition).mapToInt(String::length).max().orElse(0);
    return cars.stream().filter(car -> car.getPosition().length() == max).map(Car::getName).collect(
        Collectors.toList());
  }


  public void carsRandomNumber() {
    for(Car car : cars) {
      car.setPosition(checkGo(generateRandomNumber(), car.getPosition()));
      System.out.println(car.getName() + " : " + car.getPosition());
    }
    System.out.println();
  }

  public String checkGo(int num, String position) {
    if(num >= 4) position += "-";
    return position;
  }

  public static void main(String[] args) {
    List<Car> cars = Arrays.asList(new Car("a", "--"), new Car("b", "---"), new Car("c", "---"));

    List<String> results;

    int max = cars.stream().map(Car::getPosition).mapToInt(String::length).max().getAsInt();
    results = cars.stream().filter(car -> car.getPosition().length() == max).map(Car::getName).collect(
        Collectors.toList());

    System.out.println(results);
  }
}
