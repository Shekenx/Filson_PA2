import java.util.Scanner;

public class Filson_p3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner scnr = new Scanner(System.in);
	  final int SIZE = 5;
      String [] Topics = new String[SIZE];
      int [][] rating = new int[5][10];
      int i;
      int j;
      int sum = 0;
      int users;
      int rate;
      
      Topics[0] = "Economy";
      Topics[1] = "Politics";
      Topics[2] = "Sports";
      Topics[3] = "Health";
      Topics[4] = "Food";
     
      System.out.println("Enter the number of User(s)");
      users = scnr.nextInt();
      
     for(j = 0 ;j <= users;++j) {
    	 for (i = 0; i < 5; ++i) {
    	 System.out.println("Please rate the following topics " + Topics[i] + " ");
         rate = scnr.nextInt();
    	
             rating[i][rate] = rating[i][rate] + 1;
    	 
    	 rate++;
    	  sum = rate + 1;
    	  
    	 }
    	 sum += sum;
    	 System.out.println(sum);
    	System.out.println("I don't know how to do this Assignment!!!!!");
      
     
      
      
     }
      
    

}


}
