package ChainOfResponsibility;


public interface Chain {

	void setNextChain(Chain nextChain);
	
	void dispense(Currency cur);
}
