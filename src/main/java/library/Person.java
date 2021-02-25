package library;

public class Person implements Readable {

	private int id;
	private String name;
	private String dOB;

	public Person(int id, String name, String dOB) {
		super();
		this.id = id;
		this.name = name;
		this.dOB = dOB;
	}

	public Person(String name, String dOB) {
		super();
		this.name = name;
		this.dOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getdOB() {
		return dOB;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	@Override
	public String toString() {
		return "member: [id=" + id + " name=" + name + ", dOB=" + dOB + "]";
	}

	public void read() {
		System.out.println("Reading.....");

	}

}
