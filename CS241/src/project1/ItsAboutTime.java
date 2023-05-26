/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
Record the time for the following search:

Linear Search:
          1: 5151486 nanoseconds
        100: 5299697 nanoseconds
      1,000: 18954411 nanoseconds
     10,000: 22253718 nanoseconds
    100,000: 5179627 nanoseconds
  1,000,000: 5606695 nanoseconds
  1,000,001: 19542975 nanoseconds

Binary Search:
          1: 3993 nanoseconds
        100: 5640 nanoseconds
      1,000: 4862 nanoseconds
     10,000: 6703 nanoseconds
    100,000: 3796 nanoseconds
  1,000,000: 4327 nanoseconds
  1,000,001: 3833 nanoseconds
  
Write a couple sentences about what you observed:
Binary search is faster than linear when the given array is already sorted. Linear search is a 
search that finds an element in the list by searching the element sequentially until the element is 
found in the list. While binary search is a search that finds the middle element in the 
list recursively until the middle element is matched with a searched element.
P.S. Professor Carmine was right about starting projects early...
*/
package project1;

import java.util.Scanner;

public class ItsAboutTime {
    
	private static String result;

    public static void main(String[] args) {
    	 Scanner scan = new Scanner(System.in);
         
         // asking user for input
         System.out.println("Enter a number between one and one million");
         int userInput = scan.nextInt();
         
         // filling array with numbers 1 - 1000000
         int[] nums = new int[1000000];
         for (int i=0; i<nums.length;i++) {
             nums[i] = i+1;
         }
         // linear search
         long startTime = System.nanoTime();
         int index = linearSearch(nums, userInput);
         System.out.println("It took linear search: " + (System.nanoTime()-startTime) + " nanoseconds");
         
         // binary search
         startTime = System.nanoTime();
         index = binarySearch(nums, userInput);
         System.out.println("It took binary search: " + (System.nanoTime()-startTime) + " nanoseconds");       
    }
        public static int linearSearch(int a[], int search)
        {            
            int n = a.length; 
            for (int i = 0; i < n; i++)
            {
                if (a[i] == i)
                    return i;
            } 
            return -1;
        }

        public static int binarySearch(int a[], int search)
        {
             int partition;
              int lower = 0;
              int upper = a.length-1;

              while (upper-lower >= 1) {
                partition = ((upper - lower)/2)+lower;
                if (a[partition] == search) {
                  return partition;
                } else if(search > a[partition]){
                  lower = partition + 1;
                } else if (search < a[partition]){
                  upper = partition -1;
                }
              }
              
              return -1;
            }
    }