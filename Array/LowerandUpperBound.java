package Array;

public class LowerandUpperBound {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 3, 3, 4};
		System.out.println(Lowerbound(arr, 2));
		System.out.println(Upperbound(arr, 2));
		
		System.out.println(Lowerbound(arr, 3));
		System.out.println(Upperbound(arr, 3));

	}
	
	public static int Lowerbound(int[] arr, int data) {
		int low=0, high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==data) {
				ans=mid;
				high=mid-1;
			}else if(data<arr[mid]){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
	
	public static int Upperbound(int[] arr, int data) {
		int low=0, high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==data) {
				ans=mid;
				low=mid+1;
			}else if(data<arr[mid]){
				high=mid-1;
			}else {
				low=mid+1;
		}
	  }
		return ans;
	}
}
