public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		this.name="N/A";
		this.age=0;
	}
	public String getName(){
		return name;	
	}
	public void setName (String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return this.name + " is " + this.age + " years old.";
	}
	
}
