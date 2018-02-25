import java.util.Arrays;

public class Sort {
    private void insertSort(int[] arr){
        int j;
        int n = arr.length;
        int target;
        if(n==1||n==0){
            return;
        }
        for (int i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];
            while (j > 0 && target < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    private void shellSort(int[] arr){
        int n=arr.length;
        int strap= (int) Math.sqrt(n);
        int j,target;
        while (strap!=0){
            for (int i = strap; i < n; i+=strap)
            {
                j = i;
                target = arr[i];
                while (j > 0 && target < arr[j - 1])
                {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = target;
            }
            strap--;
        }
    }

    private void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    private void quickSort(int[] arr){
        getQuickSort(0,arr.length-1,arr);
    }
    private void getQuickSort(int low,int high,int[] arr){
        if(low>=high){
            return;
        }
        int index=getIndex(low,high,arr);
        getQuickSort(low,index-1,arr);
        getQuickSort(index+1,high,arr);
    }
    private int getIndex(int low,int high,int[] arr){
        int key=arr[low];
        while (low<high){
            while (arr[high]>=key&&high>low){
                high--;
            }
            arr[low]=arr[high];
            while (arr[low]<=key&&high>low){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[high]=key;
        return high;
    }

    private void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int tag=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    tag=j;
                }
            }
            arr[tag]=arr[i];
            arr[i]=min;
        }
    }

    private void heapSort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i, arr.length-1);
        }
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i - 1);
        }
    }
    private void adjustHeap(int[] arr,int i,int length){
        int temp=arr[i];
        for(int j=2*i;j<length;j*=2){
            if(j<length&&arr[j]<arr[j+1]){
                ++j;
            }
            if(temp>=arr[j]){
                break;
            }
            arr[i]=arr[j];
            i=j;
        }
        arr[i]=temp;
    }

    private void mergeSort(int[] arr){
        getMergeSort(arr,0,arr.length-1);
    }
    private void getMergeSort(int[] arr,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            getMergeSort(arr,low,mid);
            getMergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[l + low] = temp[l];
        }
    }

    public static void main(String[] args){
        Sort sort = new Sort();
        int[] test = {8,6,3,7,69,2,4,9,7,3,1,32,78};
        /**
         * sort.insertSort(test);
         */
        /**
         * sort.shellSort(test);
         */
        /**
         * sort.bubbleSort(test);
         */
        /**
         * sort.quickSort(test);
         */
        /**
         * sort.selectSort(test);
         */
        /**
         * sort.heapSort(test);
         */
        /**
         * sort.mergeSort(test);
         */
        sort.mergeSort(test);
        System.out.println(Arrays.toString(test));
    }
}
