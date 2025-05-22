import Implements.Email;
import Implements.SMS;
import Interface.Messaging;

public class App {
    public static void main(String[] args) throws Exception {
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();

        Messaging email =  new Email();
        email.printConnection();
        email.print();
    }
}
