package dsAlgo.sorting;

public class MergeSort {
    /**
     * Merge Sort is a Divide and Conquer algorithm.
     * It divides the input array into two halves,
     * calls itself for the two halves,
     * and then merges the two sorted halves.
     * The merge() function is used for merging two halves.
     * The merge(arr, l, m, r) is a key process
     * that assumes that arr[l..m] and arr[m+1..r] are sorted
     * and merges the two sorted sub-arrays into one.
     *
     *
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 11};
        int num = 2;
        sort(arr,0,arr.length);

    }


    /**
     * MergeSort(arr[], l,  r)
     * If r > l
     *      1. Find the middle point to divide the array into two halves:
     *              middle m = l+ (r-l)/2
     *      2. Call mergeSort for first half:
     *              Call mergeSort(arr, l, m)
     *      3. Call mergeSort for second half:
     *              Call mergeSort(arr, m+1, r)
     *      4. Merge the two halves sorted in step 2 and 3:
     *              Call merge(arr, l, m, r)
     */

    private static void sort(int[] arr, int start, int end) {
        int mid = start + (end -start)/2;

        sort(arr,start,mid);
        sort(arr,mid+1,end);

        merge(arr,start,end,mid);
    }

    private static void merge(int[] arr, int start, int end, int mid) {
        // Find sizes of two sub-arrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = start;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
