import java.util.Scanner;

class Calc{
	 int weight;
	 float height;
	 void formula() {
			 System.out.println("BMI: "+weight/(height*height));
		 	 int a=(int) (height*height);int c=weight/(a);
			if(c<18.5)
			System.out.println("UNDERWEIGHT");
			else if(c>24.9)
				System.out.println("OVERWEIGHT");
			else if(c>30)
				System.out.println("OBESE");
			else
				System.out.println("YOU'RE DOING GREAT");
			}
}
public class Bmi {
     public static void main(String[] args) {
		Calc b=new Calc();
		 Scanner s=new Scanner(System.in);
		try { System.out.println("Weight(in kg): ");
		 b.weight=s.nextInt();
		 System.out.println("Height(in m): ");
		 b.height=s.nextFloat();
        b.formula();		
    }
		finally {s.close();}
     }
}
