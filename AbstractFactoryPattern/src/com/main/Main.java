package com.main;

import com.factory.ComputerFactory;
import com.factory.DesktopFactory;
import com.factory.ServerFactory;
import com.model.Computer;

public class Main {
	public static void main(String[] args) {
		/**java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
		   valueOf() method in wrapper classes like Boolean, Integer etc.*/
		
			Computer desktop = ComputerFactory.getComputer(new DesktopFactory("2GB", "128GB", "QUAD CORE"));
			Computer server= ComputerFactory.getComputer(new ServerFactory("16GB", "128GB", "LINUX"));
			System.out.println(desktop);
			System.out.println(server);	
	}
}
