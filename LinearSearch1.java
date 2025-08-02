package time_Complexity_Material;

public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,9,12,17};
		int target = 12;
		
		int res = linearSearch1(nums,target);
		
		if(res != -1)
			System.out.println("the searched number: " + res);
		else
			System.out.println("the searched number not found");
		
		

	}
	public static int linearSearch1(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}			
		}
		return -1;
	}
}
