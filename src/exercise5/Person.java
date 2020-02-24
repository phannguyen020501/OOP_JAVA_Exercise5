package exercise5;

public class Person {
	private String name;
	private int age;
	private String id;
	private Room room;
	private int numberDayRent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getNumberDayRent() {
		return numberDayRent;
	}
	public void setNumberDayRent(int numberDayRent) {
		this.numberDayRent = numberDayRent;
	}
	
	public Person(String name, int age, String id, Room room, int numberDayRent) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.room = room;
		this.numberDayRent = numberDayRent;
	}
	public Person() {
		super();
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+"\nAge: "+this.age+"\nId: "+this.id+"\nNumber day rent: "+this.numberDayRent;
	}
	
}
