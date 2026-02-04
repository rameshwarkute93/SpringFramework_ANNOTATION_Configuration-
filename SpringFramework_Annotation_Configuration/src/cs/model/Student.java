package cs.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("3")
	private int id ;
	@Value("Suresh")
	private String name;
	@Value("Nashik")
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void disp() {
		System.out.println("Id : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Mob : " + getCity());
	}
}
