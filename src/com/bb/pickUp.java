package com.bb;

/*
 * ����һ�������ػ������ؿ͵�Ƥ��
 */
public class pickUp extends car {
	private int carCapacity; // ����Ƥ�����ؿ���
	private int carCarryCargo; // ����Ƥ�����ػ���

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