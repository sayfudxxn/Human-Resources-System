package humanResourcesSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PayReport implements Serializable
{
	public static boolean makeReport() throws IOException
	{
		FileOutputStream fileOutputStream = new FileOutputStream("payReport.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Employee());
		objectOutputStream.close();
		return true;
	}
}