
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "/Users/karlenskyp/Desktop/CS361_JAY_Project/TestScanner.jay";
	private static String RMfile1 = "/Users/ritikjai/Desktop/Univetsity Stuff/Pace University/Classes/CS 361/CS361_JAY_Project/TestScanner.jay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(RMfile1);
		System.out.println(RMfile1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			if (tk != null) System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
