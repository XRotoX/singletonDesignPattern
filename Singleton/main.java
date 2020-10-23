package singleton;

//Usage examples before and after initialising the "Terre" object

public class main {

	public static void main(String[] args) {
		Client clt = new Client();
		clt.printPopulation();
		clt.printAge();
		clt.setAge(10);
		clt.setPopulation(30);
		
		clt.Create(10, 20);
		
		clt.printPopulation();
		clt.printAge();
		clt.setAge(10);
		clt.setPopulation(30);

	}

}
