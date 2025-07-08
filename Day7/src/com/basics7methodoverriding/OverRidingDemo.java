package com.basics7methodoverriding;

public class OverRidingDemo {

	public static void main(String[] args) {
RBI rbi;
		
		//Dynamic binding assigning child object to parent class reference variable 
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());

	}

}
