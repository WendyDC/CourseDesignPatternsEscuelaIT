package com.codewen.factoryMethod;

public abstract class DeliveryMan {
	
	public abstract Vehicle getVehicle();

	public void deliver() {
		Vehicle vehicle = this.getVehicle();
		vehicle.ride();
	}
}
