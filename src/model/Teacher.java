package model;

import java.util.Scanner;

public class Teacher extends Person{
	private final int wage = 200000; // tien luong day trong 1 gio
	private int mHour;
	
	public Teacher() {}
	
	public Teacher(int mId, String mName, String mDateOfBirth, String mAddress, int mHour) {
		super(mId, mName, mDateOfBirth, mAddress);
		this.mHour = mHour;
	}
	
	/**
	 * ham nhap thong tin giao vien
	 */
	@Override
	public void input(Scanner scanner) {
		super.input(scanner);    //super phuong thuc input cua lop cha
		
		System.out.print("nhap hour: ");
		this.mHour = scanner.nextInt();
	}
	
	
	/**
	 * ham tra ve tien luong giao vien
	 */
	@Override
	public double getSalary() {
		double salary = wage * mHour;   
		return salary;
	}
	
	
	/**
	 * ham show thong tin cua giao vien
	 */
	@Override
	public void show() {
		System.out.println("id: "+getmId());
		System.out.println("name: "+getmName());
		System.out.println("date of birth: "+getmDateOfBirth());
		System.out.println("address: "+getmAddress());
		System.out.println("hour of teaching: "+this.mHour);
		System.out.println("salary: "+getSalary());
	}
	
	
}
