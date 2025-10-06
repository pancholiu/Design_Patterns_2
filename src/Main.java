import facade.Message;
import facade.NotificationServer;
import facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}