class Car {
	private float price;

	public Car(float price) {
		super();
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Car() {
		this(0);
	}

	public void carsPrice() {
		System.out.println("Car's price: " + this.price);
	}
}