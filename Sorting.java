public class Sorting{

   public static void main(String...args){
      
      //int array[]={2,6,3,7,1};
      //stableSelectionSort(array,5);
      //n is 4
      int a[]={0,1,2,3};
      int b[]=new int[4];
      for(int i=0;i<3;i++){
         b[i]=0;
      }//big theta (k)
      for(int i=1;i<4;i++){
         b[a[i]]=b[a[i]]+1;
      }//big theta (n)
      for(int i=1;i<3;i++){
         b[i]=b[i]+b[i-1];
      }//big theta (k)
   //calculation b[b]=b[a];
   }//end main
   
 public static void stableSelectionSort(int[] a, int n) 
    { 
        // Iterate through array elements 
        for (int i = 0; i < n - 1; i++)  
        { 
  
            // Loop invariant : Elements till  
            // a[i - 1] are already sorted. 
  
            // Find minimum element from  
            // arr[i] to arr[n - 1]. 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (a[min] > a[j]) 
                    min = j; 
  
            // Move minimum element at current i. 
            int key = a[min]; 
            while (min > i)  
            { 
                a[min] = a[min - 1]; 
                min--; 
            } 
              
            a[i] = key; 
        } 
    } 
   
   
  public static void selectionsort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
   
   
   public static void quickSort(int array[],int start, int end){
      if(start<end){         
         int pivot = stablePartition(array,start,end);
         
         quickSort(array,start,end-1);
         quickSort(array,start+1,end);
      }//end if
   }//end quickSort
   
   public static int partition (int array[],int start, int end)
   {
    int pivot=array[end];
 
    int i = (start - 1);  // Index of smaller element

    for (int j = start; j <= end- 1; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (array[j] <= pivot)
        {
            i++;    // increment index of smaller element
            int temp = array[i]; 
            array[i] = array[j];
            array[j]=temp;
        }
    }
    int temp= array[i + 1];
    array[i+1]=array[end];
    array[end]=temp;
    return (i + 1);
   }//end partition
   
   public static int stablePartition (int array[],int start, int end)
   {
    int pivot=array[start+(end-start)/2];
 
    int i = (start - 1);  // Index of smaller element
    int l[]=new int[array.length];
    int r[]=new int[array.length];
    for (int j = start; j <= end- 1; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (array[j]!= pivot)
        {
            if(array[j]<pivot){
               l[j]=array[j];
            }
            
            else if(array[j]>pivot){
               r[j]=array[j];
            }
            
            else{
               if(i<pivot)
                  l[i]=array[j];
               else
                  r[i]=array[j];
            }
        }
    }
    int temp= l[i + 1];
    l[i+1]=r[end];
    r[end]=temp;
    return (i + 1);
   }//end partition   
}//end class