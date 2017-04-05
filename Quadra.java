	
package test2;
	
import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class Quadra {
		 private static Scanner in;
		 private static Scanner scanner;
		 private static Scanner a;
		 
public static void main(String args[]) throws IOException{
  a = new Scanner(System.in);
  double[] num = new double[10];
  double[] num1 = new double[10];
  double[]x1=num;
  double[]y1=num1;
	scanner = new Scanner(System.in);
	System.out.print("Enter file path (for example C:\\MyProjects\\urCoordinates.txt):");
	System.out.flush();
	String filename = scanner.nextLine();
	File infile = new File(filename);
	in = new Scanner(infile);
  for (int i = 0; i < num.length && in.hasNext(); i++) {	
	 num[i] = in.nextDouble();
	 num1[i]=in.nextDouble();
		}
  int side=4;
  double x[]= num;
  double y[]=num1;
  double lengthToPoint[]=new double [side];
  double sideLength[]=new double [side];
  double angles[]=new double [side];
  for(int u=0;u<=10;u++){
	System.out.println("\nEnter the "+(u+1)+" coordinate for check");
	System.out.println("X coordinat= ");
  double xcheck=a.nextDouble();
	System.out.println("Y coordinate= ");
  double ycheck=a.nextDouble();
  double x2=xcheck;
  double y2=ycheck;
  for(int i=0;i<side;i++){
	lengthToPoint[i]=Math.sqrt(((x[i]-xcheck)*(x[i]-xcheck))+((y[i]-ycheck)*(y[i]-ycheck)));
		}
	System.out.println("List of all coordinates");  
  for(int j=0;j<side;j++){   
	System.out.println("Coordinate of vertex "+j+"= " +x[j]+" ,"+y[j] );
		}   
	for(int k=0;k<side-1;k++){   
	sideLength[k]=Math.sqrt(((x[k+1]-x[k])*(x[k+1]-x[k]))+((y[k+1]-y[k])*(y[k+1]-y[k])));
		}
	sideLength[side-1]=Math.sqrt(((x[0]-x[side-1])*(x[0]-x[side-1]))
			+((y[0]-y[side-1])*(y[0]-y[side-1])));
	
  for(int l=0;l<side-1;l++){
	angles[l] =((180/(Math.PI)))*Math.acos(((lengthToPoint[l]*lengthToPoint[l])+
			(lengthToPoint[l+1]*lengthToPoint[l+1])-
			(sideLength[l]*sideLength[l]))/(2*lengthToPoint[l]*lengthToPoint[l+1]));
		}
	angles[side-1] =((180/(Math.PI)))*Math.acos(((lengthToPoint[side-1]*lengthToPoint[side-1])
			+(lengthToPoint[0]*lengthToPoint[0])-(sideLength[side-1]*sideLength[side-1]))
			/(2*lengthToPoint[side-1]*lengthToPoint[0]));
  double sum=0;
  for(int m=0;m<side;m++){
	sum=sum+angles[m];
		}
  if (sum==360){
	System.out.println(" The  point "+(xcheck)+","+(ycheck) +" lies inside quadrangle ");   
		}
  if(sum<360){
	 System.out.println(" The point "+(xcheck)+","+(ycheck)+" lies outside the quadrangle");
		}
  else if(sum!=360&&sum>360){
		 System.out.println(" The point "+(xcheck)+","+(ycheck)+" is on side");
	    }
  for(int h=0;h<side;h++){
      if(x1[h]==x2&&y1[h]==y2)
		 System.out.println(" The point "+(xcheck)+","+(ycheck)+" is point vetrtex");
		}
	}
  }
}
	
