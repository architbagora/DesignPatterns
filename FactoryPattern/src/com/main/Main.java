package com.main;

import com.factory.Computer;
import com.factory.ComputerFactory;
import com.factory.ComputerType;

public class Main {
	public static void main(String[] args) {
		/**java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
		   valueOf() method in wrapper classes like Boolean, Integer etc.*/
			
		
			Computer desktop = ComputerFactory.getComputer(ComputerType.DESKTOP, "2GB", "128GB", "QUAD CORE");
			Computer server= ComputerFactory.getComputer(ComputerType.SERVER, "16GB", "128GB", "LINUX");
			System.out.println(desktop);
			System.out.println(server);
	}
}
