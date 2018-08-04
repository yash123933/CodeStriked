import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

public class FastTransferFiles {
	public static void main(String[] args) {
		try {
			
			FileInputStream input = new FileInputStream("D:/song/vsc.exe"); // Path of Input text file
			ReadableByteChannel source = input.getChannel();
			FileOutputStream output = new FileOutputStream("D:/song/demo/vsc.exe"); // Path of Output text file
			WritableByteChannel destination = output.getChannel();
			long startTime= System.currentTimeMillis();
			copyData(source, destination);
			System.out.println("Time is :"+(System.currentTimeMillis()-startTime));
			source.close();
			destination.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
		//ByteBuffer buffer = ByteBuffer.allocateDirect(20*1024);
		ByteBuffer buffer = ByteBuffer.allocate(20*1024);
		while (src.read(buffer) != -1) {
			// The buffer is used to drained
			buffer.flip();
			// keep sure that buffer was fully drained
			while (buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear(); // Now the buffer is empty, ready for the filling
		}

	}
}
