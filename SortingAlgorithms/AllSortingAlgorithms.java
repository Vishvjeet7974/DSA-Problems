public class AllSortingAlgorihms{

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2,6,9,4};

        int arr2[]={-1,-4,2,6,3};


        //  countSort(arr2);

        //  quickSort(arr,0,arr.length-1);

        //  mergesort(arr,0,arr.length-1);

        //  bubble_Sort(arr);

        //  selection_Sort(arr);

        //  insertion_Sort(arr);

        


         

         

         for(int val:arr)
         {
            System.out.print(val+" ");
         }

    }
    public static void bubble_Sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       
    }
    public static void selection_Sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }

              int temp=arr[smallest];
               arr[smallest]=arr[i];
               arr[i]=temp;
        }
       
    }
    public static void insertion_Sort(int arr[])
    {
       for(int i=1;i<arr.length;i++)
       {
            int element_from_unsortedPart=arr[i];

            int element_from_sortedPart=i-1;

            while(element_from_sortedPart>=0 && element_from_unsortedPart<arr[element_from_sortedPart])
            {
                arr[element_from_sortedPart+1]=arr[element_from_sortedPart];
                element_from_sortedPart--;
            }

            arr[element_from_sortedPart+1]=element_from_unsortedPart;
       }
    }






                    //  MERGE SORT 


    public static void mergesort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesort(arr, left, mid);
        mergesort(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    public static void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        for (int v = 0, h = left; v < temp.length; v++, h++) {
            arr[h] = temp[v];
        }
    }



       
  
  
  
               //  COUNT SORT  


     public static void countSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
 
          for(int num : arr)
          {
              max=Math.max(max,num);
          }
 
          for(int num : arr)
          {
             min=Math.min(min,num);
          }
        
 
         System.out.println(max);
         System.out.println(min);
         
        
         int range = max - min + 1;
 
         System.out.println(range);
 
        
         int[] count = new int[range];
 
        
         for (int num : arr) {
             count[num - min]++;
         }
 
         for (int val:count) {
             System.out.print(val + " ");
         }
 
         System.out.println();
 
       
         int index = 0;
         for (int i = 0; i < range; i++) {
             while (count[i] > 0) {
                 arr[index++] = i + min;
                 count[i]--;
             }
         }
         
     }




                   // QUICK SORTING 

                  
             public static  void quickSort(int[] arr, int start, int end) {
                     
                    if(start<end){
                        int pivotIdx=partition(arr,start,end);
           
                        quickSort(arr,start,pivotIdx-1);
                        quickSort(arr,pivotIdx+1,end);
               
                   }
               }
           
                public static int partition(int arr[], int start, int end){
           
           
                    int pivot=arr[end];
           
                    int i=start-1;
           
                            for(int j=start;j<end;j++){
                            
                                    if(arr[j] < pivot)
                                    {
                                       i++;
                                       int temp=arr[i];
                                       arr[i]=arr[j];
                                       arr[j]=temp;
                                    }
                               
                           }
           
                           i++;
                           int temp=arr[i];
                           arr[i]=pivot;
                           arr[end]=temp;
           
                           return i;
               
           
           
                   }
}