package InterfaceCodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		String newLog = "";
		for(int i = 0; i < log.length(); i++) {
			newLog += log.charAt(i);
			newLog += " ";
		}
		System.out.println(newLog);
	}

	@Override
	public void Error(String error) {
		String newError = "";
		for(int i = 0; i < error.length(); i++) {
			newError += error.charAt(i);
			newError += " ";
		}
		System.out.println("ERROR: " + newError);
	}
	
}
