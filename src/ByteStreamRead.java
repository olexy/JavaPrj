import java.io.*;

public class ByteStreamRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("bytefilewriteread.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.println(i+":"+(char)i);
		}
		bis.close();
		fis.close();
	}

}
