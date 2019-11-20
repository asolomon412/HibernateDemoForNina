package co.grandcircus.HibernateDemo109.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// this entity is considered a POJO and bean as well
@Entity // helps to map the POJO to our table
//@Table(name = "people") // -- can use this if our table names don't match
public class Person {

	@Id // this is used to represent the primary key and will be always be named @Id even if the column/variable name isn't id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // always use the primitive wrapper types to represent primitive values -- this
						// will prevent your code from throwing exceptions if null values exist in the
						// table
	//@Column(name = "fullname") // -- use this if your column names don't match
	private String name;
	private String location;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	// this constructor will be used when we want to create a new row in the table
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	// this constructor will be used when we want to update or edit an existing row
	public Person(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "id=" + id + "&name=" + name + "&location=" + location;
	}

}
