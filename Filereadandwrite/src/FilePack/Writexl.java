package FilePack;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Writexl {
	public void writeinxl() throws BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("../Filereadandwrite/only2.xls"); // estb connection
		WritableWorkbook wk = Workbook.createWorkbook(f); // create wb object
		WritableSheet ws = wk.createSheet("smruthi",0); //create sheet
		for(int i=0;i<3;i++) //row loop
		{
			for(int j=0;j<=3;j++) //column loop
			{
				Label L = new Label(j,i,"smruthi"); //cell structure
				ws.addCell(L); // add cell from label obj
				
			}
		}
		wk.write();
		wk.close();
	}

	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, 
	IOException {
		// TODO Auto-generated method stub
		Writexl obj = new Writexl();
		obj.writeinxl();

	}

}
