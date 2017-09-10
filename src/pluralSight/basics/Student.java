package pluralSight.basics;

public class Student extends Person {

	private int id;

	public Student() {
	}

	public Student(int id, int age, String name) {
		super(age, name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void printDetail() {
		System.out.println("Student class");
		System.out.println(id + " "+getName() + " " + getAge() );
	}
	
	@Override
	public int getNum(){
		return 20;
	}

}
