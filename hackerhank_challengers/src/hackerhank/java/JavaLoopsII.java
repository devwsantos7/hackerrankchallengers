package hackerhank.java;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int t = in.nextInt();

	for(int i = 0;i < t; i++){

	    int a = in.nextInt();
	    int b = in.nextInt();
	    int n = in.nextInt();
	    
	    System.out.printf("%d ",  i + 1 * b);
	    System.out.printf("%d ", i + 1 * b + b * b);
	    System.out.printf("%d ", i + 1 * b + b * b + 4 * 2);
    
	}
	
	in.close();
    }


}
