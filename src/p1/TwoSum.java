package p1;
/*
 * liuxining
 * 2017年07月31日23:41:38
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int[] r = twoSum(nums,26);
		for(int i : r){
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int nums[],int target){
		int len = nums.length;
		int[] result = new int[2];
		int i,j;
		for(i = 0;i < len - 1;i++){
			for(j = i + 1;j < len;j++){
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}
}
