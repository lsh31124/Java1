package method;

public class MethodCasting3 {
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1.5,1.5));
	}

	public static int add(int a, int b){
		System.out.println("1번 호출");
		return a+b;
	}

	public static double add(double a, double b){
		System.out.println("1번 호출");
		return a+b;
	}

}
