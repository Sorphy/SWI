package Runtime;

import Observer.EmailObserver;
import Observer.SMSGatewayObserver;
import Subject.Account;

public class Main {

	public static void main(String[] args) {
		Account account = new Account("Bla", 20150.50);
		account.registerObserver(new SMSGatewayObserver(account));
		account.registerObserver(new EmailObserver(account));
		
		account.withdraw(2015.20);

	}

}



