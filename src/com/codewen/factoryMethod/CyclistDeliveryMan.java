package com.codewen.factoryMethod;

public class CyclistDeliveryMan extends DeliveryMan{

	@Override
	public Vehicle getVehicle() {
		return new Bicycle();
	}
	
}
