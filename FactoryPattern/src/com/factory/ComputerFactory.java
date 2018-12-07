package com.factory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerType computerType , String ram, String ddr, String proc){
		switch (computerType) {
		case DESKTOP:
			return new Desktop(ram, ddr, proc);
		case SERVER:
			return new Server(ram, ddr, proc);
		}
		
		return null;
	}

}
