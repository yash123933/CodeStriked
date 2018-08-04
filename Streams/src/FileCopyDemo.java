import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyDemo {
public static void main(String[] args) throws Exception {
//	FileInputStream istream = new FileInputStream("D:/song/vsc.exe");
//	FileOutputStream ostream = new FileOutputStream("D:/song/demo/vsc2.exe");
	
	BufferedInputStream istream = new BufferedInputStream(new FileInputStream("D:/song/vsc.exe"));
	
	BufferedOutputStream ostream = new BufferedOutputStream(new FileOutputStream("D:/song/demo/vsc2.exe"));
	
	long startTime= System.currentTimeMillis();
	int ch=0;
	while(true) {
		ch=istream.read();
		if(ch==-1)  break;
		ostream.write(ch);
	}
	System.out.println("Time is :"+(System.currentTimeMillis()-startTime));
	ostream.close();
	istream.close();

	
}
}
