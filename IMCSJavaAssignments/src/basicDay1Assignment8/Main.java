package basicDay1Assignment8;

public class Main {
	public static void main(String args[]) {
		int intVal = 100;
		byte byteVal = (byte) intVal;
		byte max = 127;
		byte min = -128;
		// byte sum = min + max;
		// here (min + max) is evaluated as an integer
		byte sum = (byte) (min + max); // typecast it byte

		System.out.println("Sum = " + sum);
	}
}
