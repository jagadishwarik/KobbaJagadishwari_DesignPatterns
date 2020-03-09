package Mediator_DesignPattern;



public class ChatClient {

	public static void main(String[] args) {
		Chat mediator = new ChatImp();
		User user1 = new UserImp(mediator, "roja");
		User user2 = new UserImp(mediator, "madhu");
		User user3 = new UserImp(mediator, "radi");
		User user4 = new UserImp(mediator, "dolly");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hlo Epam");
		
	}

}
