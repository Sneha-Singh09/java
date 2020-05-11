import java.util.Scanner;
class Student
{
String[] name = new String[5];
double[] p = new double[5];
double[] c = new double[5];
double[] m = new double[5];
double[] avg=new double[5];
}
class Rank{
public static void main(String args[]){
Student t=new Student();
Scanner s=new Scanner(System.in);
System.out.println("(*-Indicates grace marks added)");
for(int i=0;i<t.name.length;i++){
System.out.println("Enter Name");
t.name[i]=s.next();
System.out.println("Enter Marks for Physics,Chemistry and Maths");
t.p[i]=s.nextDouble();
t.c[i]=s.nextDouble();
t.m[i]=s.nextDouble();
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average:"+t.avg[i]);
//----------GRACE MARKS-----------------------------------------------------------------------/////
if(t.p[i]>=50.0&&t.c[i]>=50.0&&t.m[i]>=50.0)
System.out.println("RESULT:  PASS");
else if(t.p[i]<=50&&t.c[i]>=50&&t.m[i]>=50)
{
double x=50.0-t.p[i];
if(x<=10)
{
t.p[i]=t.p[i]+x;
System.out.println("Physics*:"+t.p[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average*:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else if(t.p[i]>=50&&t.c[i]<=50&&t.m[i]>=50)
{
double x=50.0-t.c[i];
if(x<=10)
{
t.c[i]=t.c[i]+x;
System.out.println("Chemistry*:"+t.c[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average*:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else if(t.p[i]>=50&&t.c[i]>=50&&t.m[i]<=50)
{
double x=50.0-t.m[i];
if(x<=10)
{
t.m[i]=t.m[i]+x;
System.out.println("Maths*:"+t.m[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average*:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else if(t.p[i]<=50&&t.c[i]<=50&&t.m[i]>=50)
{double y=50.0-t.p[i];
double x=50.0-t.c[i];
if(x+y<=10)
{
t.c[i]=t.c[i]+x;
t.p[i]=t.p[i]+y;
System.out.println("Chemistry*:"+t.c[i]);
System.out.println("Physics*:"+t.p[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average*:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else if(t.p[i]>=50&&t.c[i]<=50&&t.m[i]<=50)
{double y=50.0-t.m[i];
double x=50.0-t.c[i];
if(x+y<=10)
{
t.c[i]=t.c[i]+x;
t.m[i]=t.m[i]+y;
System.out.println("Chemistry*:"+t.c[i]);
System.out.println("Maths*:"+t.m[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
//t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average*:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else if(t.p[i]<=50&&t.c[i]>=50&&t.m[i]<=50)
{double y=50.0-t.p[i];
double x=50.0-t.m[i];
if(x+y<=10)
{
t.m[i]=t.m[i]+x;
t.p[i]=t.p[i]+y;
System.out.println("Maths*:"+t.m[i]);
System.out.println("Physics*:"+t.p[i]);
t.avg[i]= (t.p[i]+t.c[i]+t.m[i])/3;
t.avg[i]=Math.round(t.avg[i]*100)/100;
System.out.println("Name:"+t.name[i]+"  Average:"+t.avg[i]);
System.out.println("RESULT:  PASS");}
else 
System.out.println("RESULT:  FAIL");
}
else 
System.out.println("RESULT:  FAIL");
}System.out.print("Name     :");
for(String n:t.name){System.out.print(n+"  ");
}System.out.print("\nPhysics  :");
for(double a:t.p){System.out.print(a+" ");
}System.out.print("\nChemistry:");
for(double m:t.c){System.out.print(m+" ");}System.out.print("\nMaths    :");
for(double o:t.m){System.out.print(o+" ");}System.out.print("\nAverage  :");
for(double a:t.avg){ System.out.print(a+" ");}
for(int k=0;k<=t.avg.length;k++)
{for(int j=k+1;j<t.avg.length;j++)
{if(t.avg[k]<t.avg[j])
{double temp=t.avg[k];
t.avg[k]=t.avg[j];
t.avg[j]=temp;
String f=t.name[k];
t.name[k]=t.name[j];
t.name[j]=f;
double n=t.p[j];
t.p[k]=t.p[j];
t.p[j]=n;
double i=t.c[k];
t.c[k]=t.c[j];
t.c[j]=i;
double o=t.m[k];
t.m[k]=t.m[j];
t.m[j]=o;
}
}
}
System.out.println("\nRANK :");
for(int k=0;k<t.name.length;k++)
{   System.out.print((k+1)+"."+t.name[k]);
	 System.out.print("  "+t.avg[k]);
	 if(t.p[k]<50||t.c[k]<50||t.m[k]<50)
	 { System.out.println("    FAIL");}
	 else {System.out.println("   PASS");}
}s.close();}
}
