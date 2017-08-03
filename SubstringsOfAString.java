import java.util.Scanner;
 
class SubstringsOfAString
{
   public static void main(String args[])
   {
	  Scanner in = new Scanner(System.in);
	  String string, sub;
      int length;
 
      
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
 
      length = string.length();   
 
      System.out.println("Palindrome Substrings of \""+string+"\" are :-");
 
      for(int i = 0 ; i < length ; i++ )//Outer for loop
      {
         for(int j = 1 ; j <= length - i ; j++ )//Inner for loop
         {
            sub = string.substring(i, i+j); //finding substrings of different length.
            if(sub.length()>3){ //if length of substring is greater than 3 then check for PALINDROME.
            	String rev= "";
            for(int k = sub.length()-1; k>=0;k--)//Finding the reverse of all substrings.
            	rev = rev+sub.charAt(k);
             
            if(rev.equals(sub)) //Checking whether the substring is PALINDROME or not. 
            	System.out.println(rev);
            }
           
         }//End of inner for
      }//End of outer for
      in.close();
   }
}
