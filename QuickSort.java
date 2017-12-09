public class QuickSort{
	public static void main(String[] args) {
		int[] arr = new int[] {6,4,8,4,21,2,46,51,32,165,132,1};
		quickSort(arr , 0 , arr.length-1);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
			
		}
	}
	
	public static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot) //if the number before the pivot smaller than the pivot let it
	                  i++;
	            while (arr[j] > pivot) //if num. after the pivot is bigger let it unchanged
	                  j--;
	            if (i <= j) {    //make sure that it dosent exceed the array limit 
	                  tmp = arr[i]; // swap the the other number 
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
}