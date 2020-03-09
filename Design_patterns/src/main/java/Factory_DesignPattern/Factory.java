package Factory_DesignPattern;

import Factory_DesignPattern.Computer;
import Factory_DesignPattern.PC;
import Factory_DesignPattern.Server;

public class Factory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}
