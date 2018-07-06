import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.Math.*;


class  Shape{
	
	float width;
	float height;

	float getArea(float width, float height)
	{
		this.width = width;
		this.height = height;
	}
	
	float getPerimeter(float width, float height)
	{
		this.width = width;
		this.height = height;
	}
	
}



class Square extends Shape{
    
    
	float getArea(float a,float b) // overriding
	{

		return a*a;
	}

	float getPerimeter(float a,float b)
	{
		return 4*a;
	}

	

}
class Circle extends Shape{
float getArea(float r)
 {
 	return r*r;
 }

 float getPerimeter(float r)  // overloading
 {
 	return 2*Math.PI*r;
 }

}

class Testing{


	public static void main(String[] args)
	{
		Square square = new Square();
		float width,height;
		
		width = 5;
		height = 5;

		float area = square.getArea(5,5);
		float perimeter = square.getPerimeter(5,5);

		System.out.println("printing square area : \n" + area);
		System.out.println("printing square perimeter : \n" + perimeter);

		Circle circle = new Circle();
		float radius = 5 ;
		 float area1 = circle.getArea(5);
		 float perimeter1 = circle.getPerimeter(5);

		System.out.println("printing circle area : \n" + area1);
		System.out.println("printing circle perimeter : \n" + perimeter1);



	}
}


