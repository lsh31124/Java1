package ref;

public class methodChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();

		dataA.value=10;
		System.out.println(dataA.value);
		System.out.println("dataA= "+dataA);
		changeReference(dataA);
		System.out.println(dataA.value);
		System.out.println("dataA= "+dataA);


	}

	public static void changeReference(Data dataX){
		dataX.value =20;
	}
}
