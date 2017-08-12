package com.bb;

/*
 * 所有汽车的父类
 */
public class car {
	private int carNumber; // 定义汽车的序号
	private String carName; // 定义汽车的名字
	private int carRentMoney; // 定义汽车的租金

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarRentMoney() {
		return carRentMoney;
	}

	public void setCarRentMoney(int carRentMoney) {
		this.carRentMoney = carRentMoney;
	}

}