package com.bb;

/*
 * ���������ؿ͵Ŀͳ�
 */
public class passengerCar extends car {
	private int carCapacity; // �����ؿͿͳ����ؿ���

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