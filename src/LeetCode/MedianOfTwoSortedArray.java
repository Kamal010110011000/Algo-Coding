package LeetCode;

public class MedianOfTwoSortedArray {
	
	static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double ans = 0;
            int n=nums1.length+nums2.length;
            int merge[] = new int[n];
            for(int i=0, j=0; i+j<n;) {
            	if(nums1[i]<nums2[j]) {
            		merge[i+j]=nums1[i];
            		i=(i<nums1.length-2)?i+1:i;
            	}else {
            		merge[i+j]=nums1[j];
            		j=(j<nums1.length-2)?j+1:j;
            	}
            }
            ans=(n%2==0)?merge[n/2]:(merge[n/2]+merge[n/2+1])/2;
            return ans;
    }
	
	public static void main(String[] args) {
		int[] a = {1,3};
		int b[] = {2};
		
		System.out.println(findMedianSortedArrays(a, b));
	}
	
}
