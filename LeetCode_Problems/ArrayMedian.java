package LeetCode_Problems;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] num3 = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).asDoubleStream().toArray();
        Arrays.sort(num3);
        int size = num3.length;
        int median = (size / 2);
        double medianVal = 0.0;
        if (size % 2 != 0) {
            medianVal = num3[median];
        } else {
            medianVal = (num3[median - 1] + num3[median]) / 2;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00000");
        String formattedValue = decimalFormat.format(medianVal);
        return Double.parseDouble(formattedValue);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}