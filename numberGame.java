package codSoft;

import java.util.Random;
import java.util.Scanner;

public class numberGame {

	 public static void main(String[] args) {
	        
		 Random randNumber=new Random(); 
		 Scanner sc=new Scanner(System.in);
		         
		         
		         int score=0;
		         int attempts=5;

		         System.out.println("-----------------------");
		         System.out.println("Welcome To Number Game");
		         System.out.println("-----------------------");
		         while(true){

		        	 int number=randNumber.nextInt(100)+1;
		              for(int i=1; i<=attempts; i++)
		              {
		            	 
		 		         

		                 System.out.println("Enter Your Number Between 1 To 100");
		                 int guessedNumber=sc.nextInt();

		                 if(number<1 || number>100)
		                 {
		                	 System.out.println("please enter number between 1 to 100");
		                 }
		                 else if(guessedNumber==number )
		                 {
		                     System.out.println("=====> Correct...Congratulations <=====");
		                     score++;
		                 }
		                 
		                 else if(guessedNumber<number)
		                 {
		                     System.out.println("To Less Number");
		                 }
		                 else if(guessedNumber>number)
		                 {
		                     System.out.println("To Bigg Number");
		                 }
		                 
		                 if(i==5)
		                 {
		                	 System.out.println("You have reached to maximum number of attempts, The correct number is:"+number);
		                 }
		                

		              }

		             System.out.println("your score is:"+ score);
		              System.out.println("DO you want to play again:(Y/N)");
		              System.out.println("===============================");
		              
		              String s=sc.next();
		              if(!s.equalsIgnoreCase("Y"))
		              {
		            	  System.out.println("Thanks for playing... Your final Score is:"+ score);
		            	  break;
		              }
		             
		           
		              
		              

		         }
		         sc.close();
		         

		     }
	 
}
