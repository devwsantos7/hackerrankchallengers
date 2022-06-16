package hackerhank.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaLoopsI {

    public static void main(String[] args) throws Exception {
	
	BufferedReader bufferReader = new BufferedReader(
		new InputStreamReader(System.in));
	
	int N = Integer.parseInt(bufferReader.readLine().trim());
	
	for(int i = 1; i <= 10; i++) {
	    System.out.printf("%d x %d = %d%n", N, i, (N * i));
	}
	
	bufferReader.close();
    }
}
