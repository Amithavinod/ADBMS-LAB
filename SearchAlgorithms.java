import java.util.Scanner;
import java.util.Arrays;
public class SearchAlgorithms{
	static int linearSearch(int[]arr,int target){//linear search
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
	static int binarySearchSimple(int[] arr,int target){//simple binary search
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
	static int binarySearchRecursive(int [] arr,int low,int high,int target){
		if(low>high){
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==target)
			return mid;
		else if(arr[mid]<target)
			return binarySearchRecursive(arr,mid+1,high,target);
		else
			return binarySearchRecursive(arr,low,mid-1,target);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		//input section
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int [] arr=new int[n];
		sc.nextLine();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int target=sc.nextInt();
		
		
		System.out.println("\n-------Linear search Result--------");

		int result=linearSearch(arr,target);
		if (result==-1)
			System.out.println("Not found...");
		else 
			System.out.println(" The Result is at index : "+result);
			
			
		Arrays.sort(arr);
		System.out.println("\n Array has been sorted for Binary search");
		System.out.println("Sorted array"+Arrays.toString(arr));
		System.out.println("\n-------Simple binary Search Result--------");
		int res=binarySearchSimple(arr,target);
		if (res==-1)
			System.out.println("Not found...");
		else 
			System.out.println(" The Result is at index : "+res);
			
			
		System.out.println("\n-------Recursive Binary Search Result--------");
		
		
		
		
		int r=binarySearchRecursive(arr,0,n-1,target);
		if (r==-1)
			System.out.println("Not found...");
		else 
			System.out.println(" The Result is at index : "+r);	
		}
}
		
				
