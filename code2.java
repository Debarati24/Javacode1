import java.util.*;

public class MatrixAddition {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows and columns for the matrices to be added- ");
		Scanner s = new Scanner(System.in);
		int rows= s.nextInt();
		int columns =  s.nextInt();
		
		int [][] arr1 = new int [rows][columns];
		System.out.println("Enter the elements of the first matix: ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				arr1[i][j]= s.nextInt();
			}
		}
		
		int [][] arr2 = new int [rows][columns];
		System.out.println("Enter the elements of the second matix: ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				arr2[i][j]= s.nextInt();
			}
		}
		System.out.println("The first matrix  entered is: ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("The second matrix  entered is: ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
		int [][] arr3 =  new int [rows][columns];
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("The resultant matix after addition is: ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
