package Array;

public class TwoDArray {

	public static void main(String[] args) {
		//int[][] arr;
		//System.out.println(arr);
		//arr= new int[3][3];
		//System.out.println(arr);
		//display(arr);
		
		//int[] arr=new int[][3]; //not possible
		int[][] arr=new int[3][]; //possible
		arr[0]=new int[4]; //provides zero value
		arr[1]= new int[2];
		arr[2]=new int[3];
		display(arr);
		
		
		
	}

	public static void display(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
