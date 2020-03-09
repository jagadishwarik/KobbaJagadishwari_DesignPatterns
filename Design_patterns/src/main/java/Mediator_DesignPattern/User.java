package Mediator_DesignPattern;


public abstract class User {
	protected Chat mediator;
	protected String name;
	
	public User(Chat med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
