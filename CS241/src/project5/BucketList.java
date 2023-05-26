package project5;

import java.util.ArrayList;

public class BucketList {

	ArrayList<String> arraylist = new ArrayList<String>();
	
	//BucketList Class (5%)
	public void add(String data) {
		arraylist.add(data);
	}
	
	//Merge Sort (40%)
	public void mergeSort(ArrayList<String> a, int start, int end){
	    if (start >= end) return;

	    int mid = (start + end) / 2;

	    mergeSort(arraylist, start, mid);
	    mergeSort(arraylist, mid + 1, end);
	    merge(arraylist, start, mid , end);

	  }
	
	public void merge(ArrayList<String> a, int start, int mid, int end) {
		ArrayList<String> temp = new ArrayList<String>(end - start + 1);
		
		int i = start;
        int j = mid + 1;
        int k = 0;
		
		int letter1 = arraylist.get(i).compareToIgnoreCase(arraylist.get(j));
		int letter2 = arraylist.get(j).compareToIgnoreCase(arraylist.get(i));
		        
				while (i <= mid && j <= end) {
		            if (letter1 < letter2) {
		            	temp.add(arraylist.get(i++));
		                i++;
		                k++;
		            } 
		            else {
		            	temp.add(arraylist.get(j++));
		                j++;
		                k++;
		            }
		        }
		        
		        while (i <= mid) {
		        	temp.add(arraylist.get(i++));
		            i++;
		            k++;
		        }
		        while (j <= end) {
		        	temp.add(arraylist.get(j++));
		            j++;
		            k++;
		        }
		        for (int l = 0; i < temp.size(); l++) {
		            arraylist.set(i + start, temp.get(l));
		    }
	}
	
	public void sort() {
		mergeSort(arraylist, 0, arraylist.size()-1);
	}
	
	//Print (5%)
	public void print() {
		for (int i = 0; i < arraylist.size();i++) 
        {               
            System.out.println(arraylist.get(i));         
        }
	}
}
