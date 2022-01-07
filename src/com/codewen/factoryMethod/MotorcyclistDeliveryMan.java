package com.codewen.factoryMethod;

public class MotorcyclistDeliveryMan extends DeliveryMan{

	@Override
	public Vehicle getVehicle() {
		return new Motorcycle();
	}

}
