import java.util.Scanner;
import java.lang.Math;
public class file {
public static void main(String[] args) {
		//Code for taking all the required inputs
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the coefficent of y(n)"); 
	float a = sc.nextFloat();
	System.out.println("Enter the coefficent of y(n-1)");
	float b = sc.nextFloat();
	System.out.println("Enter the coefficent of y(n-2)");
	float c = sc.nextFloat();
	System.out.println("initial conditions");
	System.out.println("value of n");
	int p = sc.nextInt();
	System.out.println("output");
	int p1 = sc.nextInt();
	System.out.println("value of n");
	int q = sc.nextInt();
	System.out.println("output");
	int q1 = sc.nextInt();
	float pk ;
	pk = p1 *b ; 
	float qk = q1 * c;
    float z = -(pk+qk);
    float pc = p1 * c;
    float zk = -((b*z)+pc);
	double r1,r2;
	int n;
	
	//code to check and assign value of discrimant
	
	float disc = b * b - 4 * a * c ;
	   if(a!=0) {
		   
		   if(disc>0) {
			   r1 = (-b + Math.sqrt(disc))/ 2 * a ;
			   r2 = (-b - Math.sqrt(disc))/ 2 * a ;
			   System.out.println("Roots are r1 = "+ r1 + " and r2 = "+ r2);
			   System.out.println("Soluton of homogenous Equation will be: c1 * (" + (r1) + ")^n + c2 *(" + r2 + " )^n");
			 
			  }
		   else if (disc == 0) {
			   r1 = r2 = -b/(2 * a);
			   System.out.println("Roots are r1 = "+ r1 + " and r2 = "+ r2);
			   System.out.println("Natural response of the system is c1 * (" + r1 + ")^n + c2 *(" + r2 + " )^n");
			   
		   }else {
			   System.out.println("Roots are imaginary");
		   }
	   } else {
		   System.out.println("single degree difference equation");
	   }
	   r1 = (-b + Math.sqrt(disc))/ 2 * a ;
	   r2 = (-b - Math.sqrt(disc))/ 2 * a ;
	   
	   //For making the two eqns to solve
double m,l,s,t;
	   m = Math.pow(r1, 0);
	   l = Math.pow(r2, 0);
	   System.out.println("Using the given intial conditions the equations will be");
	   System.out.println( z + " = c1 *" + m + "+ c2 *"+l);
	   s = Math.pow(r1, 1);
	   t = Math.pow(r2, 1);
	   System.out.println( zk + " = c1 *" + s + "+ c2 *"+t);
	    System.out.println("Solving the above two equations ,we will get");
	   //for solving linear eqn  
	    double x = (z*t - l*zk)/(m*t - l*s);
	    double y = (m*zk - z*s)/(m*t - l*s);
	    System.out.println("Value of c1 is =" + x + " and of c2 is =" + y);
		System.out.println("natural response will be :  " + x +" * " + (r1) + "^n  + " + y +"*" + (r2) +"^n");
	}

}
