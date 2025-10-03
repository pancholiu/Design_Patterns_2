import adapter.excercise.GmailAdapter;
import adapter.excercise.EmailClient;
import com.codewithmosh.adapter.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}