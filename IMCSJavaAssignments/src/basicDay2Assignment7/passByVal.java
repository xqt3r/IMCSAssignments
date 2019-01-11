package basicDay2Assignment7;

public class passByVal {
	public static void main(String args[]) {
		int sID =25;
		passByVal val = new passByVal();
		System.out.println(sID);
		
		val.passByValueMethod(sID); 
		// here sID is changed from 25 to 10 as mentioned in the method but the value of sID is altered.
		
		System.out.println(sID);
			
	}
	public void passByValueMethod(int sID) {
		sID = 10;
		System.out.println(sID);
	}
}
