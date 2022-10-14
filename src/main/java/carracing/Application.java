package carracing;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
    String carNames = sc.next();
    CarRacing carRacing = new CarRacing();
    carRacing.splitCars(carNames);

    System.out.println("시도할 회수는 몇 회인가요?");
    int count = sc.nextInt();
    carRacing.race(count);
  }
}
