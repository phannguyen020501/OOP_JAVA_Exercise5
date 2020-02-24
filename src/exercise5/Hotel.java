package exercise5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private List<Person> personList=new ArrayList<Person>();

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public Hotel() {
		super();
	}

	public Hotel(List<Person> personList) {
		super();
		this.personList = personList;
	}
	public void addPerson(Person person) {
		this.personList.add(person);
	}
	public boolean deletePerson(String id) {
		Person per=personList.stream().filter(o->(o.getId()).equals(id)).findFirst().orElse(null);
		if(per==null)
			return false;
		else 
			this.personList.remove(per);
			return true;
	}
	public double moneyForRent(String id) {
		Person per=personList.stream().filter(o->(o.getId()).equals(id)).findFirst().orElse(null);
		if(per==null)
			return 0;
		else
			return per.getRoom().getPrice()*per.getNumberDayRent();
	}
	public void show() {
		this.personList.stream().forEach(o->System.out.println(o.toString()));
	}
}
