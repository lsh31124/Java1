package method;

public class MethodReturn2 {
	public static void main(String[] args) {
		checkAge(17);
		checkAge(20);
	}

	public static void checkAge(int age){
		if(age < 18){
			System.out.println(age+"잼민이");
			return;
		}

		System.out.println(age+"성인");
		}
}