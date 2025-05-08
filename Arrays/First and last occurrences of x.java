class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        
        
           
        
        ArrayList<Integer> result = new ArrayList<>();
        int first = findOccurrence(arr, x, true);

        result.add(first);
         if(first!=-1)
         result.add( findOccurrence(arr, x, false) );

        return result;
    }

    private int findOccurrence(int[] arr, int x, boolean findFirst) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
