package Team4_Project;

public class Student {
	private String name;
	private int id;
	private String major1;
	private String major2;

	public Student(String name, int id, String major1, String major2) {
		this.name = name;
		this.id = id;
		this.major1 = major1;
		this.major2 = major2;
	}
	public String toString() {
		return this.name + "\t" + String.valueOf(this.id) + "\t" + this.major1 + "\t" + this.major2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor1() {
		return major1;
	}
	public void setMajor1(String major1) {
		this.major1 = major1;
	}
	public String getMajor2() {
		return major2;
	}
	public void setMajor2(String major2) {
		this.major2 = major2;
	}
}