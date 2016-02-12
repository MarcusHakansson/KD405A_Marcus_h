
public class bike {
	
	private String color;
	private int price;
	private int size;

	// Constructors

	/** Creates a bike with color and price */
	public bike(String color, int price) {
		this.color = color;
		this.price = price;
	}

	/**
	 * Creates a bike with color that is matched against a static list, size and
	 * price
	 */
	public bike(String color, int size, int price) {
		
		/** Sets the size to 8-28 */
		if (size >= constants.MIN_SIZE  && size <= constants.MAX_SIZE){
			this.size = size;
	}else{
		
		this.size = 0;
	}
		/** sets the price to 0-30000 */
		if (price >= constants.MIN_PRICE && price <= constants.MAX_PRICE){
			
			this.price = price;
			
		}else{
			
			this.price = 0;
		}
		
		for (int i = 0; i < constants.bikeColors.length; i++) {
			if (0 == color.compareTo(constants.bikeColors[i].toString())) {
				this.color = color;
				break;
			} else {
				this.color = "Färgen finns inte";
			}
			
		}

	}

	// Methods

	/** Fetches the color */
	public String getColor() {
		return this.color;
	}

	/** Fetches the size */
	public int getSize() {
		return this.size;

	}

	/** Fetches the price */
	public int getPrice() {
		return this.price;

	}

}
