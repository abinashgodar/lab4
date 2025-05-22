package Implements;
import java.util.Scanner;

import Interface.Messaging;

public class SMS implements Messaging {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getMessage(){
        System.out.println("Enter SMS Message:");
        String message = scanner.nextLine();
        return message;

    }

    @Override
    public String getRecipient() {
        System.out.println("Enter SMS Recipient:");
        String recipient = scanner.nextLine();
      
        return recipient;
    }

    @Override
    public void print() {
        String message = getMessage();
        String recipient = getRecipient();
        System.out.println("Message:"+message + "Sent To:"+recipient);


       
        
    }
    
}
