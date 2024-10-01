package com.bptn.course_7_oop_demo;

class Order {

	private Customer customer;
	private CartItem[] items;
//	private double totalAmount;

	public Order(Customer customer) {
		this.customer = customer;
		this.items = customer.getCart().showProductsInCart();

	}

	public void placeOrder() {
		System.out.println("Order placed successfully for " + customer.getCustomerName());
		System.out.println("Order Summary:");
		for (CartItem item : items) {
			System.out.println("\t" + item.getProduct().getProductName() + "-" + item.getCartQuantity());
		}
//		System.out.println("Total Amount: $" + totalAmount);
	}

}
