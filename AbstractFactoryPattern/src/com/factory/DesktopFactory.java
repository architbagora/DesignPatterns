package com.factory;

import com.model.Computer;
import com.model.Desktop;

public class DesktopFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;
	
	public DesktopFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new Desktop(ram,hdd,cpu);
	}
}
