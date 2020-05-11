import java.util.Scanner;
public class Guess {
	public static void main(String args[]) {
 Hidden h=new Hidden();
   h.game();
   }
}
class Hidden{
	int j=13;
	void game(){System.out.println("WELCOME TO IF YOU GUESS IT YOU WIN IT");
	        System.out.println("YOU GET THREE CHANCES IN THIS GAME");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hidden no.");
		//echochar j=s.nextInt();
		System.out.println("Enter the limit to guess");
		for(int i=s.nextInt();i>=1;i--){
        System.out.println("So What is your guess?");
        int g=s.nextInt();
        if(g==j) {}
        if(g<j)
        	{System.out.println("This number is lesser than the hidden number");
        	}
        else if(g>j) {
        	System.out.println("This number is greater than the hidden number");}
        	else {System.out.println("CONGRATULATIONS!!!!YOU WON");
              System.exit(0);}
        if(i==1) {
		     System.out.println("Hard luck!Try again");
	          System.out.println("PRESS 1 TO TRY AGAIN AND 2 TO EXIT");
	          int choice=s.nextInt();
	          switch(choice) {
	          case 1:game();
	                break;
	          case 2:System.exit(0);      
	                break;
	          default: System.out.println("Wrong Choice");
	          }
	}
	 System.out.println("You have "+(i-1)+" chances left");
	 s.close();
 }
}
}
