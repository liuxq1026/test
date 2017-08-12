package com.bb;

/*
 * 定于用于载客的客车
 */
public class passengerCar extends car {
	private int carCapacity; // 定义载客客车的载客量

	public passengerCar(int carNumber, String carName, int carRentMoney, int carCapacity) {
		this.setCarNumber(carNumber);
		this.setCarName(carName);
		this.setCarRentMoney(carRentMoney);
		this.carCapacity = carCapacity;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

}