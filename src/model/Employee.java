package model;

import java.util.Scanner;

public class Employee extends Person{
	private final double mSalary = 2000000; //tien luong co ban cua 1 thang lam viec
	private double mSalaryFactor;
	
	public Employee() {
		super();
	}
	
	public Employee(int mId, String mName, String mDateOfBirth, String mAddress , double mSalaryFactor) {
		super(mId, mName, mDateOfBirth, mAddress);
		this.mSalaryFactor = mSalaryFactor;
	}
	
	

	public double getmSalaryFactor() {
		return mSalaryFactor;
	}

	public void setmSalaryFactor(double mSalaryFactor) {
		this.mSalaryFactor = mSalaryFactor;
	}
	/**
	 * nhap thong tin nhan vien
	 */
	@Override
	public void input(Scanner scanner) {
		super.input(scanner);     //super phuong thuc input cua lop cha
		
		System.out.print("nhap he so luong: ");
		this.mSalaryFactor = scanner.nextDouble();
	}
	
	/**
	 * ham tra ve tien luong cua nhan vien
	 */
	@Override
	public double getSalary() {
		double salary = mSalary * mSalaryFactor;   //tien luong = tien luong co ban * hs luong
		return salary;
	}
	
	/**
	 * ham show ra thong tin nhan vien
	 */
	@Override
	public void show() {
		System.out.println("id: "+getmId());
		System.out.println("name: "+getmName());
		System.out.println("date of birth: "+getmDateOfBirth());
		System.out.println("address: "+getmAddress());
		System.out.println("salary factor: "+this.mSalaryFactor);
		System.out.println("salary: "+getSalary());
	}
}
