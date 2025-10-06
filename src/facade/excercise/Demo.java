package facade.excercise;

public class Demo {
  public static void show() {
    var twitterService = new TweeterService();
    twitterService.connect("appKey", "secret");
  }
}
