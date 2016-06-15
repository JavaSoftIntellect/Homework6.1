class SUV extends Car{
	public SUV() {
		this(0, false);
	}

	public SUV(int jeep, boolean highly) {
		super(jeep);
		this.highly = highly;
	}

	private boolean highly;

	public boolean isHighly() {
		return highly;
	}

	public void setHighly(boolean highly) {
		this.highly = highly;
	} 

}