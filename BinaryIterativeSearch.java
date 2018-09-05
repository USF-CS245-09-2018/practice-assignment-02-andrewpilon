public class BinaryIterativeSearch implements Practice2Search {

	public String searchName() {
		return "Binary iterative search";
	}
	
	public int search(int [] arr, int target) {
		int lower = 0;
		int upper = arr.length - 1;
		
		while(lower <= upper) {
			int mid = (lower+upper)/2;
			if(target < arr[mid]) {
				upper = mid - 1;
			}
			else if(target > arr[mid]) {
				lower = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}

// 