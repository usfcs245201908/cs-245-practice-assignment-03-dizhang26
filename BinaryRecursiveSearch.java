public class BinaryRecursiveSearch implements Practice03Search{
	public String searchName(){
		return "Binary Recursive Search";
	}
	public int binReSearch(int[] arr, int target, int low, int high){
		if (low > high)
			return -1;
		int mid = (high - low)/2;
		if (arr[mid] > target)
			return search(arr, target, low, mid-1);
		else if (arr[mid] < target)
			return search(arr, target, mid+1, high);
		else 
			return mid;
	}

	public int search(int[] arr, int target){
		int low = 0;
		int high = arr.length - 1;

		return binReSearch(arr, target, low, high);
	}
}