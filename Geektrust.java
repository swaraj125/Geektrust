import java.io.FileInputStream;
import java.util.Scanner;

public class Geektrust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\swara\\OneDrive\\Desktop\\Java\\Sample1.txt");
			Scanner sc = new Scanner(fis);
			
			int counter = 0;
			String str = "SPACE ";
			String throne = " ";
		
			while(sc.hasNextLine())
			{
				String str1 = sc.next();
				String str2 = sc.next();
				
				switch(str1)
				{
					case "LAND":
						String emblem = "PANDA";
						char[] returnedArray = new char[emblem.length()];
					
						returnedArray = cryptic(emblem);
						String rtn = checkIfExists(str2,returnedArray);
					
						if(rtn == "Found")
						{
							str = str.concat(str1);
							str = str.concat(" ");
						}
						else
						{
							str = str.concat(" ");
						}
						break;
										
					case "WATER":
						String emblem2 = "OCTOPUS";
						char[] returnedArray2 = new char[emblem2.length()];
					
						returnedArray2 = cryptic(emblem2);
						String rtn2 = checkIfExists(str2,returnedArray2);
					
						if(rtn2 == "Found")
						{
							str = str.concat(str1);
							str = str.concat(" ");
						}
						else
						{
							str = str.concat(" ");
						}
						break;
						
					case "ICE":
						String emblem3 = "MAMMOTH";
						char[] returnedArray3 = new char[emblem3.length()];
					
						returnedArray3 = cryptic(emblem3);
						String rtn3 = checkIfExists(str2,returnedArray3);
					
						if(rtn3 == "Found")
						{
							str = str.concat(str1);
							str = str.concat(" ");
						}
						else
						{
							str = str.concat(" ");
						}
						break;
						
					case "AIR":
						String emblem4 = "OWL";
						char[] returnedArray4 = new char[emblem4.length()];
					
						returnedArray4 = cryptic(emblem4);
						String rtn4 = checkIfExists(str2,returnedArray4);
					
						if(rtn4 == "Found")
						{
							str = str.concat(str1);
							str = str.concat(" ");
						}
						else
						{
							str = str.concat(" ");
						}
						break;
						
					case "FIRE":
						String emblem5 = "DRAGON";
						char[] returnedArray5 = new char[emblem5.length()];
					
						returnedArray5 = cryptic(emblem5);
						
						String rtn5 = checkIfExists(str2,returnedArray5);
					
						if(rtn5 == "Found")
						{
							str = str.concat(str1);
							str = str.concat(" ");
						}
						else
						{
							str = str.concat(" ");
						}
						break;
						
					default:
						str = str.concat("");
						counter = counter - 1;
				}
								
					counter = counter + 1;
								
			}
			if(counter >= 3)
			{
				System.out.println(str);
			}
			else
				System.out.println("None");
			
			
			sc.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	public static char[] cryptic(String s3)
	{
		char[] cryptedString = new char[s3.length()];
		
		for(int i=0;i<s3.length();i++)
		{
			char ch = s3.charAt(i);
			int aCode = (int)(ch);
			int size = s3.length();
			aCode = aCode + size;
			if (aCode > 90)
			{
				aCode = (aCode - 90) + 64;
			}
			cryptedString[i] = (char)aCode;
			
		}
		return cryptedString;
	}
	
	public static String checkIfExists(String compString,char[] compArray)
	{
		int count = compArray.length;
		for(int j=0;j<compArray.length;j++)
		{
			for(int k=0;k<compString.length();k++)
			{
				if(compArray[j] == compString.charAt(k))
				{
					count = count - 1;
					break;
				}
				else
					continue;
			}
		}
		if(count == 0)
		{
			String rtnStr = "Found";
			return rtnStr;
		}
		else
		{
			String rtnStr = "Not Found";
			return rtnStr;
		}
	}
	
}
