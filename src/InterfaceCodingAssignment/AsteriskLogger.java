package InterfaceCodingAssignment;

public class AsteriskLogger implements Logger{



	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void Error(String error) {

		String asteriskBox = "";
		
		for(int i = -13; i < error.length(); i++) {
			asteriskBox += "*";
		}
		System.out.println(asteriskBox);
		System.out.println("***ERROR: " + error + "***");
		System.out.println(asteriskBox);
	}
}