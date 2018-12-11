package Observer;

import Subject.Subject;

public class EmailObserver implements Observer{

	private Subject subject;
	
	
	public EmailObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void check() {
		System.out.println("Email has been sent. Message: " + this.subject.getMessage());
	}

}
