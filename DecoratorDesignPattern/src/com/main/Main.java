package com.main;

import com.decorator.BasicCar;
import com.decorator.Car;
import com.decorator.LuxuryCarDecorator;
import com.decorator.SportsCar;

public class Main {
	public static void main(String[] args) {
		Car c  = new SportsCar(new LuxuryCarDecorator(new BasicCar()));
		c.assemble();
	}
}
