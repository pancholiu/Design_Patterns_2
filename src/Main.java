
import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import decorator.Stream;
import decorator.excercise.Demo;

public class Main {
    public static void main(String[] args) {
        new Demo().show();


        /*
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
         */
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}