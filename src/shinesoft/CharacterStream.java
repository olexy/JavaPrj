package shinesoft;

import java.io.*;

public class CharacterStream {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("charstreamfile.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = ". Next comes 2020";
		bw.write(s);
		
		bw.close();
		fw.close();
		
		FileReader fr = new FileReader("charstreamfile.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!= -1)
		{
//			System.out.println(i+":"+(char)i);
			System.out.print((char)i);
		}
	}

}
