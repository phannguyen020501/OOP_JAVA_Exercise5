package exercise5;

public class Room {
	private String category;
	private int price;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		if(this.getCategory().equalsIgnoreCase("a")==true) {
			return 500;
		}
		else if(this.getCategory().equalsIgnoreCase("b")==true) {
			return 300;
		}
		else if(this.getCategory().equalsIgnoreCase("c")==true) {
			return 100;
		}
		else {
			return 0;
		}
	}
	public Room() {
		super();
	}
	public Room(String category) {
		super();
		this.category = category;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Category: "+this.category;
	}

}
