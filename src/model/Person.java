package model;

import java.util.Scanner;

public abstract class Person {
	private int mId;
	private String mName;
	private String mDateOfBirth;
	private String mAddress;

	public Person() {
	}

	public Person(int mId, String mName, String mDateOfBirth, String mAddress) {
		this.mId = mId;
		this.mName = mName;
		this.mDateOfBirth = mDateOfBirth;
		this.mAddress = mAddress;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmDateOfBirth() {
		return mDateOfBirth;
	}

	public void setmDateOfBirth(String mDateOfBirth) {
		this.mDateOfBirth = mDateOfBirth;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}
	/**
	 * nhap thong tin co ban
	 * @param scanner
	 */
	public void input(Scanner scanner) {
		System.out.print("nhap id: ");
		this.mId = scanner.nextInt();

		scanner = new Scanner(System.in);

		System.out.print("nhap ten: ");
		this.mName = scanner.nextLine();

		System.out.print("nhap ngay sinh: ");
		this.mDateOfBirth = scanner.nextLine();

		System.out.print("nhap dia chi: ");
		this.mAddress = scanner.nextLine();
	}
	//ham tra ve tien luong
	public abstract double getSalary(); 
	
	//ham show ra thong tin co ban
	public abstract void show();

}
