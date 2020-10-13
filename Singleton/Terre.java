package singleton;

class Terre {
	private static Terre terre;
	private static int population;
	private static int age;
	static boolean isInit = false;
	
	//"Terre" constructor
	private Terre(int population, int age, boolean isInit) {
		Terre.population = population;
		Terre.age = age;
		Terre.isInit = isInit;
		
	}
	
	//"Create" function gives clients access to create "Terre" object
	public static Terre Create(int population, int age) {
		if(terre == null) {
			synchronized(Terre.class) {
				if(terre == null) {
					terre = new Terre(population, age, true);
				}
			}
		}
		return terre;
	}
	
	
	//Getters and setters give clients access to modify and retrieve "Terre" object attributes
	public static int getPopulation() {
		return population;
		
	}

	public static void setPopulation(int population) {
		Terre.population = population;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Terre.age = age;
	}
}













