package com.codegnan.oop;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = 0.0;
		this.quantity = 1;
		
	}
public void updateQuantity(int quantity) {
	quantity+=quantity;
}
public void updateQuantity(int quantity,boolean add) {
	if(add) {
		quantity+=quantity;
	}else {
		this.quantity=quantity;
	}
}
public void addStock(int qty) {
	quantity+=qty;
}
public void removeStock(int qty) {
	quantity-=qty;
}
double discount=0;
public void discount() {
	if(quantity>=6) {
		System.out.println("Discount Applied in % : 15 ");
		
		discount=price*0.15;
		System.out.println("Discount Amount :  "+discount);	
		}else if(quantity>=3 && quantity<6) {
			System.out.println("Discount Applied in % : 10 ");
			discount=price*0.1;
			System.out.println("Discount Amount : "+discount);
		}else {
			System.out.println("Discount Applied in % : 5 ");
			discount=price*0.05;
			System.out.println("Discount Amount : " + discount);
		}
}
public double getTotalCost(){
	double cost=price*quantity;
	return cost;
}
public double getFinalPrice() {
	double finalPrice=(price*quantity)-discount;
	return finalPrice;
}
	public static void main(String[] args) {
		Product p=new Product(121,"Perfume",500.0,2);
		p.updateQuantity(4);
		p.updateQuantity(3,true);
		p.addStock(3);
		p.removeStock(2);
        System.out.println("Cost : "+p.getTotalCost());
        p.discount();
        System.out.println("Final Price : "+p.getFinalPrice());

	}

}
