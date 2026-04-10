import java.util.Arrays;
public class LC283{
    public static void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0;
        for(int i = 0;i< nums.length;i++) {
            if(nums[i] != 0) {
                arr[k++] = nums[i];
            }
        }
        for(int i = k;i < arr.length;i++) {
            arr[i] = 0;
        }
        int x = 0;
        for(int i = 0;i < arr.length;i++) {
            nums[i] = arr[x++];
        }
    }
	public static void main(String[] args) {
		int[] arr = {1,2,5,4,42,0,5,0,4,56,0};
		System.out.println("Array Before moving zeroes: ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		moveZeroes(arr);
		System.out.println("Array After moving zeroes: ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}