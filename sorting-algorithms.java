package area;
import java.util.*;
public class Area{
    public static void main(String[] args){
        //Sorting methods are below
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
