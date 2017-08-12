package com.bb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class initialTest {

	public static void main(String[] args) {
		System.out.println("欢迎使用嗒嗒租车系统！");
		System.out.println("您是否要租车？ ：1 是  0 否");
		Scanner c = new Scanner(System.in);
		int k = c.nextInt();
		if (k == 1) {
			System.out.println("您可租车的类型及其价目表：");
			car[] carForRent = { new passengerCar(1, "奥迪A4", 500, 4), new passengerCar(2, "马自达6", 400, 4),
					new pickUp(3, "皮卡雪6", 450, 4, 2), new passengerCar(4, " 金龙 ", 800, 20), new trunk(5, "松花江", 400, 4),
					new trunk(6, "依维柯", 1000, 20) };
			System.out.println("序号" + "\t" + "汽车名称" + "\t" + "租金" + "\t" + "\t" + "容量");

			// 打印输出可供租的汽车清单
			for (car car : carForRent) {
				// 用instanceOf来测试左边类型的对象是否是右边类型的实例，返回值为Boolean
				if (car instanceof passengerCar) {
					// 若它是客车类型的实例，则打印出客车应该有的属性值，这里注意强转，否则不会出现
					// passengerCar类的CarCapacity属性
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/天" + "\t" + "载人:" + ((passengerCar) car).getCarCapacity() + "人");

				}
				if (car instanceof pickUp) {
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/天" + "\t" + "载人:" + ((pickUp) car).getCarCapacity() + "人" + "\t" + "载货:"
							+ ((pickUp) car).getCarCarryCargo() + "吨");
				}
				if (car instanceof trunk) {
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/天" + "\t" + "载货:" + ((trunk) car).getCarCarryCargo() + "吨");
				}
			}

			System.out.println("请输入您要租的汽车的数量");
			int totalNum = c.nextInt(); // 用于接收汽车的总数量

			// 调用集合框架List用于存储客户租车的清单
			List<car> carList = new ArrayList<car>();
			int p = 0; // p变量用来拓展carList的容量

			List<car> carListPassenger = new ArrayList<car>(); // 用来储存可载人的车辆
			List<car> carListTrunk = new ArrayList<car>(); // 用来储存可载货的车辆

			int totalPassenger = 0;
			; // 用来存储总的载人数
			int totalCarrayCargo = 0; // 用来存储总的载货量
			int totalMoney = 0; // 用来计算租车的总资金

			/*
			 * 主要思想：用循环遍历在添加客户租车的序号，用集合框架List来存储客户租的车辆。
			 * 同时在客户输入序号的时候与三种车辆进行比对，计算相应车辆的载人数，载货量以及租车的总资金 同时添加到载人车辆或者载货车辆当中
			 */
			for (int i = 0; i < totalNum; i++) {
				System.out.println("请输入第" + (i + 1) + "辆车的序号：");
				int num = c.nextInt(); // 用于接收输入的汽车的序号
				carList.add(carForRent[num - 1]);
				System.out.println("成功添加：" + carList.get(p).getCarName());
				if (carForRent[num - 1] instanceof passengerCar) {
					totalPassenger += ((passengerCar) carList.get(p)).getCarCapacity();
					totalMoney += ((passengerCar) carList.get(p)).getCarRentMoney();
					carListPassenger.add(carList.get(p));
				}
				if (carForRent[num - 1] instanceof pickUp) {
					totalPassenger += ((pickUp) carList.get(p)).getCarCapacity();
					totalCarrayCargo += ((pickUp) carList.get(p)).getCarCarryCargo();
					totalMoney += ((pickUp) carList.get(p)).getCarRentMoney();
					carListPassenger.add(carList.get(p));
					carListTrunk.add(carList.get(p));
				}
				if (carForRent[num - 1] instanceof trunk) {
					totalCarrayCargo += ((trunk) carList.get(p)).getCarCarryCargo();
					totalMoney += ((trunk) carList.get(p)).getCarRentMoney();
					carListTrunk.add(carList.get(p));
				}
				p++;
			}

			System.out.println("请输入租车的天数：");
			int carRenDay = c.nextInt();
			totalMoney = totalMoney * carRenDay;

			System.out.println("********************可载人的车有********************");
			for (car car : carListPassenger) {
				System.out.println(car.getCarName());
			}

			System.out.println("********************可载货的车有********************");
			for (car car : carListTrunk) {
				System.out.println(car.getCarName());
			}

			System.out.println("********************租车的总价格********************");
			System.out.println(totalMoney * carRenDay);

		} else if (k == 0) {
			System.out.println("感谢您的再次使用！再见！");

		} else {
			System.out.println("您输入的信息有错！");
		}
	}
}