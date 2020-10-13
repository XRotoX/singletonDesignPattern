package singleton;

class Terre {
	private static Terre terre;
	private static int population;
	private static int age;
	static boolean isInit = false;
	
	private Terre(int population, int age, boolean isInit) {
		Terre.population = population;
		Terre.age = age;
		Terre.isInit = isInit;
		
	}
	
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













