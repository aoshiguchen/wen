

public class Person{
	
	private String name;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		
		return "Person [name=" + this.name + "]";
	}
	
}