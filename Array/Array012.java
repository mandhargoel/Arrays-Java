package Array;

public class Array012 {

	public static void main(String[] args) {
		int[] arr= {1,1,2,0,1,0,2,1};
		int[] ans=sort(arr);
		display(ans);
	}
	
	public static int[] sort(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		
		while(mid<=high) {
			if(arr[mid]==0) {
				//swap elements at low and mid index
				swap(arr, low, mid);
				low++;mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				swap(arr, mid, high);
				high--;
				
			}
		}
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int val:arr) {
			System.out.print(val+ " ");
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
}
