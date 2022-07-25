import java.util.Random;

public class Phone {
	
	Random rand = new Random();

	private String Brand;
	private Integer Age;
	private String FavoriteApp;
	private String Owner;
	
	public Phone() {
		Brand = null;
		Age = 0;
		FavoriteApp = null;
		Owner = null;
	}
	
	public Phone(String brand, Integer age, String app, String owner) {
		this.Brand = brand;
		this.Age = age;
		this.FavoriteApp = app;
		this.Owner = owner;
	}
	
	//Getters
	public String getBrand() {
		return Brand;
	}
	public Integer getAge() {
		return Age;
	}
	
	
	public String getOwner() {
		return Owner;
	}

	//Setters
	public void setOwner(String owner) {
		this.Owner = owner;
	}
	public void setAge(Integer age) {
		this.Age = age;
	}
	public void setFavoriteApp(String app) {
		this.FavoriteApp = app;
	}
	
	public boolean hasWarranty() {
		if (this.getAge()<=5) {
			return true;
		} else {
			return false;
		}
	}
	
	public String checkWeather() {
		if (rand.nextInt(10)%2==0) {
			return "It is sunny out";
		} else {
			return "It is rainy out";
		}
		
	}
	
	public static void main(String[] args) {
		Phone myPhone = new Phone("iPhone",3, "Clash Royale", "Ethan");
		System.out.println(myPhone.getBrand());
		System.out.println(myPhone.getOwner());
		System.out.println(myPhone.getAge() + " years");
		System.out.println(myPhone.hasWarranty());

		
		myPhone.setOwner("Eric");
		myPhone.setAge( myPhone.getAge() + 3);
		myPhone.setFavoriteApp("Flappy Bird");
		
		System.out.println(myPhone.getBrand());
		System.out.println(myPhone.getOwner());
		System.out.println(myPhone.getAge() + " years");
		System.out.println(myPhone.hasWarranty());
		
		System.out.println(myPhone.checkWeather());
		
	}
}
