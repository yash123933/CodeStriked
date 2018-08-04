import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
	public static void main(String[] args) throws Exception {
		student student=new student(37,38,39);
		student.result();
		String file= "D:/song/demo/stu.dat";
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		fos.close();
		
		//DEserialization
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
		Object obj =istream.readObject();
		student stu=(student)obj;
		stu.result();
		istream.close();
	}
}
