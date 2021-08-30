package personal.project.app;

public class Clock {
//se numesc constante
	public static final int MINUTES = 60;
	public static final int SECONDS = 60;
	public static final int HOURS = 24;

	public String colour;
	public String manufacture;
	public String type;

	// default constructor
	public Clock() {

	}

//parametrizer constructor
	public Clock(String colour, String manufacture, String type) {
		this.colour = colour;
		this.manufacture = manufacture;
		this.type = type;
	}

	public void sound() {
		if (this.type.equalsIgnoreCase("analog")) {
			System.out.println("tic-tac tic- tac tic-tac");
		} else
			System.out.println("The clock is silent");
	}

	public int convertMinuteToHours(int minutes) {
		int hourse = minutes / 60;
		return hourse;
	}

	@Override
	public String toString() {
		return " Clock Specification \n color:" + colour + "\n manufacture:" + manufacture + "\n type:" + type;
	}
}
