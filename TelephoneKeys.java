import java.util.Scanner;
/**
  This program
*/

public class TelephoneKeys
{
  public static void main(String[] args)
  {
    String name="Tatenda Ndambakuwa";
    System.out.println(name);
    System.out.println("CMSC255 Section 2");
    System.out.println("Lab 3");
    
    
    Scanner in= new Scanner(System.in);
    // Prompt user to enter a letter
    System.out.print("Enter a letter:");
    String s = in.nextLine();
  char input = s.charAt(0);
  //ch = Character.toUpperCase(ch);
  
  
  // display number
  int number =0;
 
  
  
    
    // Adjust number if necessary
    
    if (input == 'A' || input == 'B' || input== 'C' )
  {
    System.out.println("The number is"+ " " +"2") ;
  }
  else if (input== 'D' || input == 'E' || input== 'F' )
  {
    System.out.println("The number is"+ " " + "3"); 
  }
   else if (input== 'G' || input == 'H' || input== 'I' )
  {
    System.out.println("The number is"+ " " + "4") ;
  }
    else if (input== 'J' || input == 'K' || input== 'L' )
  {
    System.out.println("The number is"+ " " + "5") ;
  }
     else if (input== 'M' || input == 'N' || input== 'O' )
  {
    System.out.println("The number is"+ " " + "6") ;
  }
      else if (input== 'P' || input == 'Q' || input== 'R' || input== 'S' )
  {
    System.out.println("The number is"+ " " + "7") ;
  }
  else if (input== 'T' || input == 'U' || input== 'V' )
  {
    System.out.println("The number is"+ " " +"8") ;
  }
  else if (input== 'W' || input == 'X' || input== 'Y' || input== 'Z')
  {
    System.out.println("The number is"+ " " +"9") ;
  }
        else
        {
          System.out.println("wrong");
          System.out.println(input + " is an invalid input");
        }
//System.out.println("The corresponding number is " + "");
  }
}
