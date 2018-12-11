package Subject;

import java.util.ArrayList;

import Observer.Observer;

public class Account implements Subject{

	private ArrayList<Observer> observers;
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.observers = new ArrayList<Observer>();
	}
	
	
	public void withdraw(double x) {
		if(x <= this.balance) {
			this.balance -= x;
			this.checkObservers();
		}
	}
	
	
	@Override
	public String getMessage() {
		return this.name + " : " + this.balance;
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void unregisterObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void checkObservers() {
		for(Observer observer : observers) {
			observer.check();
		}
		
	}

}
