package FilePack;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RowNum {
	public void ReadRow(int rowNo) throws IOException
	{
		File f = new File("../Filereadandwrite/Practicetext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b1 = new BufferedReader(fr);
		int s = 0;
		String data;
		while((data = b1.readLine())!=null)
		{
			s = (s+1) ;
			if(s == rowNo)
			{
				System.out.println(data);
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RowNum rn = new RowNum();
		rn.ReadRow(3);

	}

}
