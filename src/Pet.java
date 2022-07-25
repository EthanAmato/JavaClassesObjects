
public class Pet {
	
	private String Name;
	private Integer Age;
	private String Location;
	private String Type;
	
	public Pet() {
		Name = null;
		Age = 0;
		Location = null;
		Type = null;
	}
	
	public Pet(String name, Integer age, String location, String type) {
		this.Name = name;
		this.Age = age;
		this.Location = location;
		this.Type = type;
	}
	
	//Getters
	public String getName() {
		return Name;
	}
	public Integer getAge() {
		return Age;
	}
	
	
	public String getType() {
		return Type;
	}

	//Setters
	public void setName(String name) {
		this.Name =name;
	}
	public void setAge(Integer age) {
		this.Age = age;
	}
	public void setLocation(String location) {
		this.Location = location;
	}

	
	
	public static void main(String[] args) {
		Pet myCat = new Pet("Shackleton",8,"My House","Cat");
		System.out.println(myCat.getName());
		System.out.println(myCat.getAge());
		System.out.println(myCat.Location);
		myCat.setLocation("The Vet");
		System.out.println(myCat.Location); //works because we're inside the initialization of the class - other implementations of the Pet class would not have access to location information

	}

}
