package singleton;

//To give user more accessibility and good experience we've created this class to interact with the user
//by printing messages and handling errors.

public class Client {
	public static String CREATION_SUCCESS = "Terre was created successfully.";
	public static String NOT_CREATED_YET = "Terre was not instantiated yet!";
		
	public Client() {
		
	}

	public void Create(int population, int age) {
		Terre.Create(population, age);
		System.out.println(CREATION_SUCCESS);
				
	}
	
	public void printPopulation() {
		
		if(Terre.isInit != false) {
			System.out.println("Terre population is: " + String.valueOf(Terre.getPopulation()));
		}
		else {
			System.out.println(NOT_CREATED_YET);
		}
		
	}

	public void setPopulation(int population) {
		
		if(Terre.isInit != false) {
			Terre.setPopulation(population);
			System.out.println("Terre population was set to: " + String.valueOf(population));
		}
		else {
			System.out.println(NOT_CREATED_YET);
		}
		
	}

	public void printAge() {
		
		if(Terre.isInit != false) {
			System.out.println("Terre age is: " + String.valueOf(Terre.getAge()));
		}
		else {
			System.out.println(NOT_CREATED_YET);
		}
		
	}

	public void setAge(int age) {
		
		if(Terre.isInit != false) {
			Terre.setAge(age);
			System.out.println("Terre population was set to: " + String.valueOf(age));
		}
		else {
			System.out.println(NOT_CREATED_YET);
		}
		
	}
}


