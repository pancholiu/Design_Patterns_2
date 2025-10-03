package composite.excercise;

public class HumanResource implements Operation {
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
