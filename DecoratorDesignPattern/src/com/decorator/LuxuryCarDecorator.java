package com.decorator;

public class LuxuryCarDecorator extends CarDecorator{

	public LuxuryCarDecorator(Car c){
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("In LUXURY CAR");
	}
	
}
