package dataReader1;
import java.io.BufferedReader;// read text from a character-input stream
import java.io.FileNotFoundException;//it opens the file
import java.io.FileReader;//this reads the file
import java.io.IOException; // finds exception

public class DataReader {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		try{
			fr = new FileReader("C:/Users/mahfuzul/Desktop/telephone.txt"); // file location
		}
		catch(FileNotFoundException el){ //error handling
			el.printStackTrace();
		}
		String  st;
		br = new BufferedReader(fr);
		try {
			while((st = br.readLine())!=null){ //reading file from the computer
				System.out.println(st); //printing the file
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally{
			try{
				if(br != null){// closing file
					br.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();//catching error
			}

	}
	}

		

	}


