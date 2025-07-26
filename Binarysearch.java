package time_Complexity_Material;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,6,8,9,11,13,17};
		int target = 8;
		
		int result =binarySearch(nums,target);
		
		if(result != -1)
			System.out.println("the index of the targeted elements is:" + result);
		else
			System.out.println("the index of the give elemenet is not found and  the element is not in the list");
		

	}
	public static int binarySearch(int[] nums,int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
				
			else {
				right = mid -1;
			}
		}
		return -1;
		
	}
	

}
