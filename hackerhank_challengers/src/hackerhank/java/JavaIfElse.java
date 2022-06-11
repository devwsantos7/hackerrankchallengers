package hackerhank.java;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	int N = scanner.nextInt();
	
	if (N % 2 == 1) {
	    System.out.println("Weird");
	} else {
	    System.out.println("Not Weird");
	}

	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	scanner.close();

    }

}
