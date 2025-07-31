package time_Complexity_Material;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = length(A);
		
		int nums[] = {1,3,50,200,459,900,953};
		int target =900;
		
		int result1 = linearSearch(nums,target);
		
		if(result1 != -1)
			System.out.println("Element fount at index :"+ result1);
		else
			System.out.println("elemenet not fount");
		

	}
	public static int linearSearch(int[] nums,int target) {
		int steps = 0;
		for (int i= 0;i<nums.length;i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("steps taken by linear :" + steps);
				return i;				
			}
		}
		System.out.println("steps taken by linear:" + steps);
		return -1;
	}
	

}
