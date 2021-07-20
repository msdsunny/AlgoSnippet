void quickSort(int[] arr, int left, int right) { 
 int index = partition(arr, left, right); 
 if (left < index - 1) { 
    quickSort(arr, left, index - 1); 
 } 
 if (index < right) { 
    quickSort(arr, index, right); 
 } 
} 

public int partition(int[] arr,int left,int right) {
   int pivot = arr[(left + right) / 2]; 
   while (left <= right) { 
   while (arr[left] < pivot) left++; 
   while (arr[right] > pivot) right--;  
   if (left <= right) { 
     swap(arr, left, right); 
    left++; 
    right--; 
    } 
  } 
   System.out.println(Arrays.toString(array));
   return left; 
}

public void swap(int[] arr,int left,int right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

int[] array = {25,29,36,32,38,44,40,54};
int[] array = {10,20,30,40,50};
quickSort(array,0,array.length-1);

