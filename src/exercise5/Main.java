package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		Scanner sc6=new Scanner(System.in);
		Hotel hotel=new Hotel();
		Room rooma=new Room("a");
		Person pera=new Person("nguyên", 19, "1a", rooma, 5);
		hotel.addPerson(pera);
		//System.out.println(pera.getRoom().getPrice());
		while(true) {
			System.out.println("Application Manager Client");
			System.out.println("Enter 1: To insert person for rent");
			System.out.println("Enter 2: To delete person by id");
			System.out.println("Enter 3: To show information");
			System.out.println("Enter 4: To caculator money by id");
			System.out.println("Enter 5: To exit");
			int line1=sc1.nextInt();
			switch(line1) {
			case 1:{
				System.out.println("Enter name:");
				String name=sc2.nextLine();
				System.out.println("Enter age:");
				int age=sc3.nextInt();
				System.out.println("Enter id:");
				String id=sc4.nextLine();
				System.out.println("Enter category A,B,C:");
				String category=sc5.nextLine();
				Room room=new Room(category);
				System.out.println("Enter number of days to rent");
				int numberDayRent=sc6.nextInt();
				Person person=new Person(name, age, id, room, numberDayRent);
				hotel.addPerson(person);
				System.out.println(person.toString());
				break;
			}
			case 2:{
				System.out.println("Enter id to delete:");
				String id=sc2.nextLine();
				if(hotel.deletePerson(id)==true){
					System.out.println("complete");
				}
				else {
					System.out.println("delete fail");
				}
				break;
			}
			case 3:{
				hotel.show();
				break;

			}
			case 4:{
				System.out.println("Enter id:");
				String id=sc2.nextLine();
				System.out.println("Money:");
				System.out.println(hotel.moneyForRent(id));
				break;
			}
			case 5:{
				return;
			}
			default:{
				System.out.println("Invalid");
				continue;
			}
		}
	}

}
}
