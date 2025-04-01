import java.util.*;
class Areacalculator
{
double area(double side)
 {
return side*side;
 }
  double area(double length,double breadth)
  {
  return length*breadth;
   }
   double areaCircle(double radius)
   {
   return 3.1416*radius*radius;
      }
    }
public class AreaOverload
 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Areacalculator obj = new Areacalculator();
System.out.print("Enter the side of the square:");
double side = sc.nextDouble();
System.out.print("\nArea of the Square:"+obj.area(side));
System.out.print("\nEnter the Length of the Rectangle:");
double length = sc.nextDouble();
System.out.println("\nEnter the Breadth of the Rectangle:");
double breadth = sc.nextDouble();
System.out.print("\nArea of the rectangle:"+obj.area(length,breadth));
System.out.print("\nEnter the radius of the Circle:");
double radius = sc.nextDouble();
System.out.print("\nArea of the Circle:"+obj.areaCircle(radius));
sc.close();
      }
   }
