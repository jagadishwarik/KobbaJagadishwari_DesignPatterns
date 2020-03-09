package ChainOfResponsibility;


import java.util.Scanner;

public class ATMDispenceChain {

	private Chain c1;

	public ATMDispenceChain() {
		// initialize the chain
		this.c1 = new Dollar50();
		Chain c2 = new Dollar20();
		Chain c3 = new Dollar10();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ATMDispenceChain atmDispenser = new ATMDispenceChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}

	}

}

