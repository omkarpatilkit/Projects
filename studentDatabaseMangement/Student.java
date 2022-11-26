package studentDatabaseMangement;

public class Student {
	
	private String sName;
	private String sLastName;
	private int age;
	private String city;
	
	public Student(String sName , String sLastName , int age, String city) {
		this(sName ,  age, city);
		this.sLastName = sLastName;		
	}
	
	public Student(String sName , int age, String city) {
		this( sName ,  age);
		this.city = city;
		}
	
	public Student(String sName , int age) {
		this(sName);
		this.age = age;
			
	}
	
	public Student(String sName ) {
		super();
		this.sName = sName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
