package feedback;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{

  private static final int FORWARD_NUM = 4;
  private static final int MAX_BOUNT = 10;
  @Override
  public boolean movable() {
    return getRandomNo() >= FORWARD_NUM;
  }

  protected int getRandomNo() {
    Random random = new Random();
    return random.nextInt(MAX_BOUNT);
  }

}
