package Lesson1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.*;
import java.io.File;
import java.io.PrintWriter;

public class MyClass {
		public static void main(String[] args) {
			Date dat = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss");
//System.out.println(System.currentTimeMillis());
System.out.println(sdf.format(dat));
//BufferedReader br1 = null;
			String str = "";
			Integer stryc = 0;
			Integer stry = 0;
			int strmax = 0;
			boolean flag = false;
			
try{ 
	File outputfile = new File("C:\\Personal\\Big data\\myoutput.txt");
	PrintWriter mywriter = new PrintWriter(outputfile);
	if (!outputfile.exists())
	{outputfile.createNewFile();}
	
	FileReader fl1 = new FileReader("C:\\Personal\\Big data\\firstfile.txt");
	BufferedReader br1 = new BufferedReader(fl1);
	
	while ((str = br1.readLine())!= null) {
      stry = Integer.parseInt(str.substring(0, 4));
      
			if (!stryc.equals(stry) && (flag == true))
			{System.out.println(stryc + " " + strmax);
			mywriter.println(stryc + " " + strmax);
				strmax = 0;
			} flag = true;
			stryc = Integer.parseInt(str.substring(0, 4));
							if (strmax < Integer.parseInt(str.substring(4, 6)))
		{strmax = Integer.parseInt(str.substring(4, 6));}	
		}
	System.out.println(stryc + " " + strmax);
	mywriter.println(stryc + " " + strmax);
	mywriter.close();
	br1.close();}

catch (IOException e) {
	e.printStackTrace();
} 
finally {
try {
}
catch (Exception e2) {
}
}}}
	
	