package com.exam;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;
	
	public Ticket(String origin, String destination, int price, int quantity){
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;
	}
	public String print(){
		int total = price*quantity;
		System.out.println(origin + "\t" + destination + "\t" + price + "\t" + quantity + "\t" + total);
		return print();
		
	}
}
	


