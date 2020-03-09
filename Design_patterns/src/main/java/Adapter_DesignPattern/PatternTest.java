package Adapter_DesignPattern;

public class PatternTest {  
	 public static void main(String args[]){  
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  System.out.print(targetInterface.getCreditCard());  
	 }   
	}
