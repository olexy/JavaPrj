package shinesoft;

import java.io.*;

public class ByteStreamClasses {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bytefilewriteread.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String st = "This Week is long";
		byte arr[] = st.getBytes();
		for(byte a:arr)
		{
			System.out.println(a+":"+(char)a);
		}
		bos.write(arr);
		fos.write(arr);
		fos.close();
	}
}
