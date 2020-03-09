package Mediator_DesignPattern;


public interface Chat {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
