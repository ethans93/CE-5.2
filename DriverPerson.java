import java.util.Scanner;

public class DriverPerson {

	public static void main (String [] args){
		
		Scanner keyboard = new Scanner (System.in);
		
		Person person1 = new Person();
		
		System.out.println("Name: ");
		String name = keyboard.next();
		person1.setName(name);
		
		System.out.println("Age: ");
		int age = keyboard.nextInt();
		person1.setAge(age);
		
		Person person2 = new Person();
		
		System.out.println("Name: ");
		/*String*/ name = keyboard.next();
		person2.setName(name);
		
		System.out.println("Age: ");
		/*int*/ age = keyboard.nextInt();
		person2.setAge(age);
		
		if(person1.getName().equals(person2.getName())){
			System.out.println("These two people have the same name!");
			person1.setName(person1.getName()+"-A");
			person2.setName(person2.getName()+"-B");
		}
		
		System.out.println("\n"+person1);
		System.out.println(person2+"\n");
		
		if(person1.getAge()>person2.getAge()){
			System.out.println(person1.getName()+" is older than "+person2.getName()+".");
		}
		else if(person1.getAge()<person2.getAge()){
			System.out.println(person1.getName()+" is younger than "+person2.getName()+".");
		}
		else{
			System.out.println(person1.getName()+" and "+person2.getName()+" are the same age.");
		}
		
	
	}
}
