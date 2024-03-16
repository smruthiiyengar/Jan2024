package FilePack;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readxl {
	public void readxldata() throws BiffException, IOException
	{
		File f = new File("../Filereadandwrite/data.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=0;i<=r;i++)
		{
			for(int j=0; j<=c; j++)
			{
				Cell wc = ws.getCell(j,i);
				System.out.println(wc.getContents());
			}
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		Readxl r = new Readxl();
		r.readxldata();
		//Readxl.closeFile();
	}

}
