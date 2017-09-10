package pluralSight.basics;

public class Person {
	private int age;
	private String name;

	public Person() {

	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum(){
		return 30;
	}
	
	public void printDetail(){
		System.out.println("Person class");
		System.out.println(this.name + " " +  this.age);
	}
	
	public void printIsAged(){
		System.out.println("Aged" + (getNum() > 20) );
	}

}
