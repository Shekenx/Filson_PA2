import java.util.Scanner;

public class Filson_p1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		final int NUM_DIGITS = 4;
		int [] userDigits = new int[NUM_DIGITS];
		int i;
		int tempVal = 0;
		
		
		System.out.println("Enter " + NUM_DIGITS + " digit integers one at a time: ");
	      for (i = 0; i < NUM_DIGITS; ++i) {
	 		 userDigits[i] = scnr.nextInt();
	      }
	      
	      
	      System.out.print("Your input: ");
	      for (i = 0; i < NUM_DIGITS; ++i) { 
	      System.out.print(userDigits[i]);
	      }
	      System.out.println();
	      
	      
	      tempVal = userDigits[0];   //Swap                   
          userDigits[0] = userDigits[2];
          userDigits[2] = tempVal;
          tempVal = userDigits[1]; 
          userDigits[1] = userDigits[3];
          userDigits[3] = tempVal;
          
          
          for (i = 0; i < (userDigits.length); ++i) {
        	  for (i = 0; i < NUM_DIGITS ; ++i) { 
        	  userDigits[i] += 7;
        	  userDigits[i] %= 10;
          }
        	  
        	  
       // Print numbers
       System.out.print("Encrypted digits: " + " ");
       for (i = 0; i < NUM_DIGITS ; ++i) {
          System.out.print( userDigits[i]);
       }
       System.out.println();
       
       
       tempVal = userDigits[2];   //Swap                   
          userDigits[2] = userDigits[0];
          userDigits[0] = tempVal;
          tempVal = userDigits[3]; 
          userDigits[3] = userDigits[1];
          userDigits[1] = tempVal;
          
          
       for (i = 0; i < (userDigits.length); ++i) {
        	  for (i = 0; i < NUM_DIGITS ; ++i) { 
        	  userDigits[i] -= 7;
        	  userDigits[i] = ( userDigits[i] + 10 ) % 10;
          }
        	  System.out.print("Decrypted digits: " + " ");
		       for (i = 0; i < NUM_DIGITS ; ++i) {
		          System.out.print( userDigits[i]);
		       }
		       System.out.println();
       }
    }
  }

}

