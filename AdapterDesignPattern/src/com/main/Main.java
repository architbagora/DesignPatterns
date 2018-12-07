package com.main;

import com.adapter.SocketAdapter;
import com.adapter.SocketAdapterImpl;

public class Main {
	public static void main(String[] args) {
		SocketAdapter socketAdapter =new  SocketAdapterImpl();	
		
		System.out.println(socketAdapter.get120Volt());
		System.out.println(socketAdapter.get12Volt());
		System.out.println(socketAdapter.get3Volt());
		
		System.out.println(socketAdapter);
		System.out.println(socketAdapter.toString());
	}
}
