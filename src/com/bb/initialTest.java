package com.bb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class initialTest {

	public static void main(String[] args) {
		System.out.println("��ӭʹ�����⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵�� ��1 ��  0 ��");
		Scanner c = new Scanner(System.in);
		int k = c.nextInt();
		if (k == 1) {
			System.out.println("�����⳵�����ͼ����Ŀ��");
			car[] carForRent = { new passengerCar(1, "�µ�A4", 500, 4), new passengerCar(2, "���Դ�6", 400, 4),
					new pickUp(3, "Ƥ��ѩ6", 450, 4, 2), new passengerCar(4, " ���� ", 800, 20), new trunk(5, "�ɻ���", 400, 4),
					new trunk(6, "��ά��", 1000, 20) };
			System.out.println("���" + "\t" + "��������" + "\t" + "���" + "\t" + "\t" + "����");

			// ��ӡ����ɹ���������嵥
			for (car car : carForRent) {
				// ��instanceOf������������͵Ķ����Ƿ����ұ����͵�ʵ��������ֵΪBoolean
				if (car instanceof passengerCar) {
					// �����ǿͳ����͵�ʵ�������ӡ���ͳ�Ӧ���е�����ֵ������ע��ǿת�����򲻻����
					// passengerCar���CarCapacity����
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/��" + "\t" + "����:" + ((passengerCar) car).getCarCapacity() + "��");

				}
				if (car instanceof pickUp) {
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/��" + "\t" + "����:" + ((pickUp) car).getCarCapacity() + "��" + "\t" + "�ػ�:"
							+ ((pickUp) car).getCarCarryCargo() + "��");
				}
				if (car instanceof trunk) {
					System.out.println(car.getCarNumber() + "\t" + car.getCarName() + "\t" + car.getCarRentMoney()
							+ "/��" + "\t" + "�ػ�:" + ((trunk) car).getCarCarryCargo() + "��");
				}
			}

			System.out.println("��������Ҫ�������������");
			int totalNum = c.nextInt(); // ���ڽ���������������

			// ���ü��Ͽ��List���ڴ洢�ͻ��⳵���嵥
			List<car> carList = new ArrayList<car>();
			int p = 0; // p����������չcarList������

			List<car> carListPassenger = new ArrayList<car>(); // ������������˵ĳ���
			List<car> carListTrunk = new ArrayList<car>(); // ����������ػ��ĳ���

			int totalPassenger = 0;
			; // �����洢�ܵ�������
			int totalCarrayCargo = 0; // �����洢�ܵ��ػ���
			int totalMoney = 0; // ���������⳵�����ʽ�

			/*
			 * ��Ҫ˼�룺��ѭ����������ӿͻ��⳵����ţ��ü��Ͽ��List���洢�ͻ���ĳ�����
			 * ͬʱ�ڿͻ�������ŵ�ʱ�������ֳ������бȶԣ�������Ӧ���������������ػ����Լ��⳵�����ʽ� ͬʱ��ӵ����˳��������ػ���������
			 */
			for (int i = 0; i < totalNum; i++) {
				System.out.println("�������" + (i + 1) + "��������ţ�");
				int num = c.nextInt(); // ���ڽ�����������������
				carList.add(carForRent[num - 1]);
				System.out.println("�ɹ���ӣ�" + carList.get(p).getCarName());
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

			System.out.println("�������⳵��������");
			int carRenDay = c.nextInt();
			totalMoney = totalMoney * carRenDay;

			System.out.println("********************�����˵ĳ���********************");
			for (car car : carListPassenger) {
				System.out.println(car.getCarName());
			}

			System.out.println("********************���ػ��ĳ���********************");
			for (car car : carListTrunk) {
				System.out.println(car.getCarName());
			}

			System.out.println("********************�⳵���ܼ۸�********************");
			System.out.println(totalMoney * carRenDay);

		} else if (k == 0) {
			System.out.println("��л�����ٴ�ʹ�ã��ټ���");

		} else {
			System.out.println("���������Ϣ�д�");
		}
	}
}