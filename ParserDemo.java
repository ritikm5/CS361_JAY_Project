public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("/Users/ritikjai/Desktop/Univetsity Stuff/Pace University/Classes/CS 361/CS361_JAY_Project/TestParser.jay");

		if(tStream.isEndofFile()) {
			System.out.println("JAY file is empty or unable to read.");
			return;
		}

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		int count =1;

		while(cSyntax.token != null) {
			System.out.println("------------");
			System.out.println(" Test Run " + count++);
			Program p = cSyntax.program();
			System.out.println(p.display());
		}

	}

}