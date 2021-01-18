import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    boolean valid = false;
    
    while(valid == false) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Password");
      String password = input.nextLine();
      
      int length = password.length();
      
      char firstLetter = password.charAt(0);
      char lastLetter =  password.charAt(length - 1);
      
      int firstValue = (int) firstLetter;
      int lastValue = (int) lastLetter;
      
      if ((firstValue >= 40 & firstValue <= 42) & (lastValue >= 60 & lastValue <= 90) & (length > 7)) {
        valid = true;
      }  else {
        System.out.println("Error password must be at least 8 characters, with a ()* to start and a captial at the end");
      }
    }  
      
   System.out.println("Your password meets the strength requirements");
   


  
  }
}