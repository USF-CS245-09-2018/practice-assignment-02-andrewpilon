public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName() {
		return "Binary recursive search";
	}
	
	public int search(int [] arr, int target) { // so that we can get the initial array length
		return searchhelp(arr, target, 0, arr.length-1);
	}
	
	public int searchhelp(int [] arr, int target, int lower, int upper) {
		int mid = (lower+upper)/2;
		if(lower > upper) {
			return -1;
		}
		if(target < arr[mid]) {
			return searchhelp(arr, target, lower, mid-1);
		}
		if(target > arr[mid]) {
			return searchhelp(arr, target, mid+1, upper);
		}
		if(target == arr[mid]) {
			return mid;
		}
		return -1;
	}
}