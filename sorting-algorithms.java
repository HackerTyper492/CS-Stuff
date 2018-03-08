package area;
import java.util.*;
public class Area{
    public static void main(String[] args){
        Random rn = new Random();
        int[] n = {rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)};
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(bubbleSort(n)));
        System.out.println(Arrays.toString(selectionSort(n)));
    }
    public static int[] bubbleSort(int[] nums) {
        int hold;
        for (int i=nums.length; i>0; i--) {
            for (int j=0; j<i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    hold = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = hold;
                }
            }
        }
        return nums;
    }
    public static int[] selectionSort(int[] nums) {
        int hold;
        for (int i=0; i<nums.length; i++) {
            int min=i;
            for (int j=i; j<nums.length; j++) {
                if (nums[j]<nums[min]) {
                    min = j;
                }
            }
            if (min!=i) {
                hold=nums[min];
                nums[i]=nums[min];
                nums[min]=hold;
            }
        }
        return nums;
    }
}
