import java.util.Scanner;
/*60/12=5462
 * 30*4=2
 * 8+2=82
 * 8%2=10
 * 9-2=234
 * these calculations should be wrong others should be right
 */
public class FaultyCalci {
  public static void main (String args[]) { //throws InputMismatchException//
	  Calci c=new Calci();
	  c.solve();
  }
}
class Calci {
	int a;
	int b;
	void solve () {
	Scanner s=new Scanner(System.in);
	System.out.println("Calculate");
	a=s.nextInt();
	char o=s.next().charAt(0);
	b=s.nextInt();
	if(o=='+') {
	if(a==8&&b==2) 
		System.out.println(a+""+o+""+b+"=82");
	else
		 System.out.println(a+""+o+""+b+"="+(a+b));
	}
	if(o=='*') {
	if(a==30&&b==4) 
		System.out.println(a+""+o+""+b+"=2");
	else
		System.out.println(a+""+o+""+b+"="+(a*b));
	}
	if(o=='-') {
		if(a==9&&b==2) 
		  System.out.println(a+""+o+""+b+"=234");
		else
		  System.out.println(a+""+o+""+b+"="+(a-b));
	}
	if(o=='/') {
		if(a==60&&b==12) 
			System.out.println(a+""+o+""+b+"=5462");
		else
		System.out.println(a+""+o+""+b+"="+(a/b));
		}
	if(o=='%') {
		if(a==8&&b==2) 
		System.out.println(a+""+o+""+b+"=10");
		else
		System.out.println(a+""+o+""+b+"="+(a%b));
	}
	if(o=='^')
		System.out.println(a+""+o+""+b+"="+Math.pow(a, b));
	System.out.println("To continue press 1 and 2 to exit");
	int ch=s.nextInt();
	switch(ch) {
	case 1:solve();
	       break;
	case 2:break;
	}s.close();
	}
	
	}
	