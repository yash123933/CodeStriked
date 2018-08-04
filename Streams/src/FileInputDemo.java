import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		String file= "D:/song/song.txt";
		FileInputStream fileInputStream=new FileInputStream(file);
		//Array of the size of available bytes in the stream
		byte[] bs=new byte[fileInputStream.available()];
		fileInputStream.read(bs);// reading stream data into byte
		String content = new String(bs);//converting byte array to stream
		System.out.println(content);
//		int ch;
//		while(true) {
//			ch=fileInputStream.read();//reading a byte from the stream
//			if(ch==-1) break;//EOF break the loop
//			System.out.print((char)ch);//printing character
//		}
		fileInputStream.close();
	}

}
