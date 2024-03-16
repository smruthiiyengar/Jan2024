package FilePack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	public void ReadData() throws IOException
	{
		File f = new File("../Filereadandwrite/Smr.txt"); //esbt connextion
		FileReader fr = new FileReader(f); //Filereader Object
		int a;
		while((a=fr.read())!=-1) //loop for reading  char
		{
		System.out.println((char)a);	
		}
	}
	public void readDataLinebyLine() throws IOException 
	{
		File f = new File("../Filereadandwrite/Smr.txt"); //esbt connextion
		FileReader fr = new FileReader(f); //Filereader Object
		BufferedReader b = new BufferedReader(fr);
		String s;
		while((s=b.readLine())!= null)
		{
			System.out.println(s);
		}
	}
	
	public void writeData() throws IOException
	{
		File f = new File("../Filereadandwrite/Smr.txt");
		FileWriter fw = new FileWriter(f);//File writing object
		BufferedWriter b = new BufferedWriter(fw);
		b.write("welcome to world  ");
		b.newLine(); //move cursor to nextline
		b.write("SDET is bugging");
		fw.close();
	}
	//keep the last data and add new data as well
	public void writeDataappend() throws IOException
	{
		File f = new File("../Filereadandwrite/Smr.txt");
		FileWriter fwa = new FileWriter(f,true);//File writing object
		BufferedWriter a = new BufferedWriter(fwa);
		a.write("welcome to world r linke  ");
		a.newLine(); //move cursor to nextline
		a.write("SDET is interesting");
		a.close();
	} 
	public static void main(String[] args) throws IOException 
	{
		//ReadFile r = new ReadFile();
		//r.ReadData();
		//ReadFile b = new ReadFile();
		//b.readDataLinebyLine();
		ReadFile w = new ReadFile();
		w.writeData();
		ReadFile app = new ReadFile();
		app.writeDataappend();
		
	}
}
