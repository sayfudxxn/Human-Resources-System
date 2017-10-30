package humanResourcesSystem;

import java.io.IOException;

public class Main
{
	public static void main(String [] args) throws IOException, ClassNotFoundException
	{
		SystemData.loadFromDisk();
		//new MainController();
	}
}