package hackerhank.java;

import java.util.Locale;
import java.util.Scanner;

public class JavaStdinStdoutII {
    
    public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	Scanner scan = new Scanner(System.in);

	int i = scan.nextInt();

	double d = scan.nextDouble();
	if (scan.hasNextLine()) {
	    scan.nextLine();
	}
	String s = scan.nextLine();

	System.out.printf("String: %s%n", s);
	System.out.println("Double: " + d);
	System.out.println("Int: " + i);

	scan.close();
    }
}
