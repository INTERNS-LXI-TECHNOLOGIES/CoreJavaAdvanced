
import java.io.*;
public class FileManager
{

	public File loadFile()
	{
		File file = new File("E:\\prgmfiles\\CoreJavaAdvanced\\ContactApp\\src\\com\\lxisoft\\filerepo\\data.csv");
		try
		{
			Boolean tf = file.exists();
			if(!tf)
			{	
				file.createNewFile();

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return file;
	}

	
	
}