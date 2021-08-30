package personal.project.app;

public class Car {
	public String name;
	public String model;
	public String version;
	public int horsepower;

	public Car() {

	}

	public Car(String name, String model, String version, int horsepower) {
		this.name = name;
		this.model = model;
		this.version = version;
		this.horsepower = horsepower;
	}

	public void recom() {
		if (this.version.equalsIgnoreCase("Cupe")) {
			System.out.println(" 2 person recom");
		} else
			System.out.println(" 5 person recom");
	}

	@Override
	public String toString() {
		return "Car Specificati \n name: " + name + "\n model: " + model + "\n version: " + version + "\n horsepower: "
				+ horsepower;
	}

}
