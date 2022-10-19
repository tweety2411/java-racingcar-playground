package racingcar.domain;

import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    Scanner sc = new Scanner(System.in);
    String carNames = sc.nextLine();

    System.out.println("시도할 회수는 몇회인가요?");
    int tryNo = sc.nextInt();

    RacingCar rc = new RacingCar(carNames, tryNo);
    ResultView rv = new ResultView();


    List<Car> carList;

    while (!rc.isEnd()) {
      carList = rc.race();
      rv.printRace(carList);
    }

    carList = rc.findWinner();
    rv.printWinners(carList);

  }
}
