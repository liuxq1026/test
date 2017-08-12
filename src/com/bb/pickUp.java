package com.bb;

/*
 * 构造一个既能载货又能载客的皮卡
 */
public class pickUp extends car {
	private int carCapacity; // 定义皮卡的载客量
	private int carCarryCargo; // 定义皮卡的载货量

	public pickUp(int carNumber, String carName, int carRentMoney, int carCapacity, int carCarryCargo) {
		this.setCarNumber(carNumber);
		this.setCarName(carName);
		this.setCarRentMoney(carRentMoney);
		this.carCapacity = carCapacity;
		this.carCarryCargo = carCarryCargo;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

	public int getCarCarryCargo() {
		return carCarryCargo;
	}

	public void setCarCarryCargo(int carCarryCargo) {
		this.carCarryCargo = carCarryCargo;
	}

}