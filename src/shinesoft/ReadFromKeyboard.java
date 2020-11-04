package shinesoft;

import java.io.*;

public class ReadFromKeyboard {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter a number");
		String d = br.readLine();
		
		System.out.println("Enter a number");
		String e = br.readLine();
		
		System.out.println(Integer.parseInt(d)+Integer.parseInt(e));
		System.out.println(Float.parseFloat(d)+Float.parseFloat(e));
	}

}
