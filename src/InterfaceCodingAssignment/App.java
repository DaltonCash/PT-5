package InterfaceCodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		logger1.Log("This is a log");
		logger1.Error("This is an Error");
		
		Logger logger2 = new SpacedLogger();
		logger2.Log("This is a log");
		logger2.Error("This is an Error");
	}

}
