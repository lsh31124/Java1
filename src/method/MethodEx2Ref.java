package method;

public class MethodEx2Ref {
	public static void main(String[] args) {

		printMessage("이직", 3);
		printMessage("하고", 5);
		printMessage("싶다", 7);
	}

	public static void printMessage(String message, int times){

		for(int i=0;i < times; i++){
			System.out.println(message);

		}
	}



}
