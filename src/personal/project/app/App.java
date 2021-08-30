package personal.project.app;

public class App {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.name = "BMW";
		car1.model = "530i";
		car1.version = "Sedan";
		car1.horsepower = 265;
		System.out.println(car1);
		car1.recom();
		System.out.println();

		Car car2 = new Car("Nissan", "Scay Lyne", "Cupe", 820);
		System.out.println(car2);
		car2.recom();

		System.out.println();

		Clock clock1 = new Clock("Red", "Casio", "analog");
		System.out.println(clock1);
		clock1.sound();

		System.out.println();

		Clock clock2 = new Clock();
		clock2.colour = "Blue";
		clock2.manufacture = "Rolex";
		clock2.type = "Digital";
		System.out.println(clock2);
		clock2.sound();

	}

}
