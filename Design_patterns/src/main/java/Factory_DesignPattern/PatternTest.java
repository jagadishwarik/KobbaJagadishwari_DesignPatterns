package Factory_DesignPattern;

import Factory_DesignPattern.Factory;
import Factory_DesignPattern.Computer;

public class PatternTest {

	public static void main(String[] args) {
		Computer pc = Factory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = Factory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}

