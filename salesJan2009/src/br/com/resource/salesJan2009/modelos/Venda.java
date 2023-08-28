package br.com.resource.salesJan2009.modelos;

public class Venda {
	private String price;
	private String product;
	private String paymentType;
	
	public Venda() {
		super();
		
	}

	public Venda(String price, String product, String paymentType) {
		super();
		this.price = price;
		this.product = product;
		this.paymentType = paymentType;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "Venda [price=" + price + ", product=" + product + ", paymentType=" + paymentType + "]";
	}
	
	
}
