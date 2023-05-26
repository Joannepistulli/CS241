package project5;

public class BucketManager {
	
	public BucketList[] arr;
	
	public BucketManager() {
		arr = new BucketList[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new BucketList();
		}
	}
	
	//BucketManager Class (35%)
	public void add(String data) {
		int bucketIndex = data.toUpperCase().charAt(0) - 65;
		
		arr[bucketIndex].add(data);
	}
	
	//Print (5%)
	public void print() {
		for(BucketList b : arr) {
		b.print();
		}
	}
	
	//Sort (5%)
	public void sort() {
		for(BucketList b : arr) {
		b.sort();
		}
	}
}
