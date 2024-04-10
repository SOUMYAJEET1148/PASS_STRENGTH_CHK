import java.util.Scanner;

public class PasswordStrengthChecker{
        @SuppressWarnings({ "resource", "unused" })
        public static void main(String[] args) {
            
                final int NUM_UPPER_LETTERS =1;
                final int NUM_LOWER_LETTERS =3;
                final int NUM_DIGITS =1;
                int upperCount = 0;
                int lowerCount = 0;
                int digitCount = 0;
                int letterCount =0;
                Scanner in = new Scanner(System.in);
                System.out.println("password must contain Uppper Case LowerCase Or Digit");
                System.out.println("Enter Your Password: ");
                String input = in.nextLine();
                int inputLen = input.length();

                for(int i=0; i<inputLen; i++)
                {
                    char ch = input.charAt(i);
                    if(Character.isUpperCase(ch))
                    upperCount++;
                    else if(Character.isLowerCase(ch))
                    lowerCount++;
                    else if(Character.isDigit(ch))
                    digitCount++;

                }
                if(upperCount >= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS && digitCount >= 
                NUM_DIGITS){
                    System.out.println("PASSWORD STRENGTH IS STRONG");
                }
           
              else  if(upperCount == NUM_UPPER_LETTERS && lowerCount == NUM_LOWER_LETTERS || digitCount == 
                NUM_DIGITS)
                {
                    System.out.println("PASSWORD STRENGTH IS AVERAGE");
                }
                else
                {
                    System.out.println("PASSWORD STRENGTH IS VERY POOR");
                    System.err.println("The Password didnot Have Enough Of The Following");
                    if(upperCount < NUM_UPPER_LETTERS)
                    System.out.println("UpperCase Letters");
                    if(lowerCount < NUM_LOWER_LETTERS)
                    System.out.println("LowerCase letters");
                    if(digitCount < NUM_DIGITS)
                    System.out.println("Digits");
                }

           }

}