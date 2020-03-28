package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Employee;
import model.Person;
import model.Teacher;

public class MangagerFunction {
	private List<Person> listEmployee = new ArrayList<Person>();

	public MangagerFunction() {
	}

	public MangagerFunction(List<Person> listEmployee) {
		this.listEmployee = listEmployee;
	}

	// ham tra ve so luong phan tu trong list
	public int getSum() {
		return listEmployee.size();
	}

	// them phan tu vao trong list
	public void input(Scanner scanner) {
		Person person;
		System.out.println("1.Employee || 2.Teacher"); // lua chon 1 | 2 sao cho phu doi tuong can them vao

		System.out.print("select: ");

		int choose = scanner.nextInt();

		if (choose == 1) {

			person = new Employee();  //khoi tao doi tuong person la 1 nhan vien

			person.input(scanner);

			listEmployee.add(person);
			
		} else if (choose == 2) {

			person = new Teacher();  //khoi tao doi tuong person la 1 giao vien

			person.input(scanner);

			listEmployee.add(person);
		} else {
			System.out.println("khong co chuc nang nay...");
		}
	}

	// ham show ra tat ca thong tin cac phan tu trong list
	public void show() {
		for (Person person : listEmployee) {
			person.show();
			System.out.println("=========");
		}
	}

	// in ra thong tin nguoi co tien luong cao nhat
	public void getMaxSalary() {
		double max = listEmployee.get(0).getSalary();

		for (int i = 1; i < listEmployee.size(); i++) {
			if (listEmployee.get(i).getSalary() > max)
				max = listEmployee.get(i).getSalary();
		}

		for (Person person : listEmployee) {
			if (person.getSalary() == max)
				person.show();
		}
	}

	// ham tra ve tong so tien luong phai tra
	public void getTotalSalary() {
		int sum = 0;
		for (Person person : listEmployee) {
			sum += person.getSalary();
		}

		System.out.println("the total salary must paid: " + sum);
	}

	// in ra bang luong
	public void payrollList() {
		System.out.println("===============");
		for (Person person : listEmployee) {
			System.out.println(person.getmName() + "\t" + person.getSalary() + "\n");
		}
		System.out.println();
	}

}
