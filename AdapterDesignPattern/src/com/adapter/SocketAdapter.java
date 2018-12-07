package com.adapter;

import com.model.Volt;

public interface SocketAdapter {
	public Volt get120Volt();
	public Volt get3Volt();
	public Volt get12Volt();
}
