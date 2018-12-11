package Observer;

import Subject.Subject;

public class SMSGatewayObserver implements Observer {

	private Subject subject;
	
	public SMSGatewayObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void check() {
		System.out.println("SMS has been sent. Message: " + this.subject.getMessage());
	}

}
