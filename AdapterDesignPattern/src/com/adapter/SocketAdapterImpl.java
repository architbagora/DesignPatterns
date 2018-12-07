package com.adapter;

import com.model.Socket;
import com.model.Volt;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		Volt volt = getVolts();
		return convertVolt(volt, 1);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = getVolts();
		return convertVolt(volt, 40);
	}

	@Override
	public Volt get12Volt() {
		Volt volt = getVolts();
		return convertVolt(volt, 10);
	}

	public Volt convertVolt(Volt volt , int valueOfVolt){
		return new Volt(volt.getVolt()/valueOfVolt);
	}
	
}
