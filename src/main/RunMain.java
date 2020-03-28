package main;

import java.util.Scanner;

import utils.MangagerFunction;
import model.Person;

public class RunMain {
	

	public static void main(String[] args) {
	   MangagerFunction mangagerFunction = new MangagerFunction();
		Scanner scanner = new Scanner(System.in);
		int choose;
		do {
			menu();
			System.out.print("choose: ");
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				mangagerFunction.input(scanner);
				break;
			case 2:
				//list phai co it nhat 5 phan tu
				if (mangagerFunction.getSum() < 5)
					System.out.println("danh sach it nhat bang 5 de thuc hien chuc nang nay..");
				
				else mangagerFunction.payrollList();
				
				break;
			case 3:
				//list phai co it nhat 5 phan tu
				if (mangagerFunction.getSum() < 5)
					System.out.println("danh sach it nhat bang 5 de thuc hien chuc nang nay..");
				
				else mangagerFunction.getMaxSalary();
				
				break;
			case 4:
				//list phai co it nhat 5 phan tu
				if (mangagerFunction.getSum() < 5)
					System.out.println("danh sach it nhat bang 5 de thuc hien chuc nang nay..");
				
				else mangagerFunction.getTotalSalary();
				
				break;
			case 5:
				System.out.println("thanks..!!");
			}
		} while (choose != 5);

		System.out.println();
	}

	public static void menu() {
		System.out.println("\t\t=== Employee Management ===");
		System.out.println("1.Input employee or teach");
		System.out.println("2.Show payroll list");
		System.out.println("3.show person has highest salary");
		System.out.println("4.show total salary must paid");
		System.out.println("5.Exit");
	}

}
