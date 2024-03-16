package FilePack;

import java.io.*;

public class PracticeRead {
	public void ReadFile() throws IOException
	{
		File f = new File("../Filereadandwrite/Practicetext.txt");
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
	}
	
	public void Readwholeline() throws IOException 
	{
		File f = new File("../Filereadandwrite/Practicetext.txt"); //estb connextion
		FileReader fr = new FileReader(f); // use file reader obj
		BufferedReader br = new BufferedReader(fr); //use buffered reader obj
		String s;
		while((s = br.readLine()) != null) { 
			System.out.println(s);
		}			
	}
	
	public void writedata() throws IOException
	{
		File f = new File("../Filereadandwrite/Practicetext.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Practice writing into file");
		bw.newLine(); //move cursor to nextline
		bw.write("SDET is bugging");
		bw.close();
	}
	public void appendData() throws IOException
	{
		File f= new File("../Filereadandwrite/Practicetext.txt");
		FileWriter fwa = new FileWriter(f,true);//File writing object
		BufferedWriter a = new BufferedWriter(fwa);
		
	}
	public static void main(String[] args) throws IOException
	{
		
		PracticeRead pr = new PracticeRead();
		pr.ReadFile();
		PracticeRead b = new PracticeRead();
		b.Readwholeline();
		PracticeRead wr = new PracticeRead();
		wr.writedata();

	}

}
