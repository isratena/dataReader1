package dataReader1;
import java.util.Random;

public class RandomNumberManipulation {

	public static void main(String[] args) {
		Random r = new Random(); // random class constructor
		int arr[] = new int[5];
		int sum=0;//setting array number 50

		for(int i = 0; i <arr.length; i++){
		   //random numbers from 1 to 10:
		   arr[i] = r.nextInt(10)+1 ; //random number putting into array
		   System.out.println(arr[i]);
		}
System.out.println("/////////////");
		for(int i = 0; i <5; i++){ // printing only even numbers
			if(arr[i]%2==0)
				sum+= arr[i];
		   System.out.print(sum+" " );}
		
		//System.out.println("/////////////");
		//int total = 0;

		//for(int n =0; n<arr.length; n++) //loop for adding numbers from array

			//{total  = total + arr[i];

		//System.out.println(total);}} // printing the total number from array


	}
		
	}
		