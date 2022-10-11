import java.util.Scanner;


public class GenerateRandomNumbers {
	private static double rai=0f;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radious:");
		rai = sc.nextDouble();//user input
		System.out.println("Enter a total index pair of (x,y):");
		int index = sc.nextInt();//user input
		
		
		int numX[] = new int[index];
		int numY[] = new int[index];
		sc.close();
	
		for (int i = 0; i < index; i++) {
		   numX[i] = (int) (Math.random() * (rai + 1));
		   numY[i] = (int) (Math.random() * (rai + 1));
	   
		   // Main Class
		   System.out.println("(" +numX[i] + "," + numY[i] + ")");
			}

	}}
		
