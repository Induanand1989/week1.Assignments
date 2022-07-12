package week1.Assignments;

public class MyCalculator {

	public static void main(String[] args) {
		//Declaration Part
		
		int add,sub;
		double mul;
		float div;
		
		//object creation part
		
		Calculator cal=new Calculator();
		
		//Methods calling
        add=cal.add(30, 45, 60);
		sub=cal.sub(200, 68);
		mul=cal.mul(69d, 89d);
		div=cal.div(389f, 91f);
		
       //Printing Statement
		System.out.println("Addition   = "+add);
		System.out.println("Subraction = "+sub);
		System.out.println("Multification  = "+mul);
		System.out.println("Division = "+div);

	}

}
