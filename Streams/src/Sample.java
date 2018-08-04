import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/** JDK 7+. */
public final class Sample {

		public static void main(String... aArgs) throws IOException {
	    Path FROM = Paths.get("D:/song/vsc.exe");
	    Path TO = Paths.get("D:/song/demo/vsc2.exe");
	    //overwrite existing file, if exists
	    long startTime= System.currentTimeMillis();
	    CopyOption[] options = new CopyOption[]{
	    StandardCopyOption.REPLACE_EXISTING,
	    StandardCopyOption.COPY_ATTRIBUTES	
	    }; 
	    Files.copy(FROM, TO, options);
	  	System.out.println("Time is :"+(System.currentTimeMillis()-startTime));

  }
}