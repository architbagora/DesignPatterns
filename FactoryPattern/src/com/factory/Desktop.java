package com.factory;

public class Desktop extends Computer{
	 String ram;
	 String ddr;
	 String processor;
	 
	public Desktop(String ram, String ddr, String processor) {
		super();
		this.ram = ram;
		this.ddr = ddr;
		this.processor = processor;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.ddr;
	}

	@Override
	public String getCPU() {
		return this.processor;
	}
	
	@Override
	public String toString(){
		return "DESKTOP CONFIG : RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
