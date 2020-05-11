import java.util.Scanner;

class Solution{int k;
	void result() {
		System.out.println("Enter 2 no.");
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int j=s.nextInt();
	System.out.print("GCD is ");
	System.out.println(solve(i,j));
	s.close();}
	int solve(int x,int y) {
	if(x%y==0) {return y;}
	else {
	k=x%y;
	return solve(y,k);}
	}
	
}
public class Gcd {
public static void main(String args[]) {
	Solution t=new Solution();
	t.result();
} 
}
