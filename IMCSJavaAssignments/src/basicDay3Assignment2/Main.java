package basicDay3Assignment2;

public class Main {
	public static void main(String args[]) {
		int firstArrayMatrix[][] = {{1,1,1}, {1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2}, {2,2,2}};
		int sumMatrix[][] = new int [2][3];
		
		for (int i = 0 ; i < firstArrayMatrix.length; i++) {
			for(int j=0; j< firstArrayMatrix[i].length; j++) {
				sumMatrix[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
			}
		}
		for (int i = 0 ; i < firstArrayMatrix.length; i++) {
			for(int j=0; j< firstArrayMatrix[i].length; j++) {
				System.out.print(sumMatrix[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
