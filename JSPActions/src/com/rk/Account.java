package com.rk;

public class Account {
	
	//For jsp bean we need to use same name as declared in html page
	int acno;
	String LName;
	String Fname;
	int Balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
	
	
	

}
