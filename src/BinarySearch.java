public class BinarySearch {
    public static int binarySearch(int a[],int goal){
        int high= (int) Math.floor(a.length/2);
        int low=0;
        while (low<=high) {
            int middle= (int) Math.floor((low+high)/2);
            if (a[middle]==goal) {
                return middle;
            }
            else if (a[middle]>goal) {
                high=middle-1;
            }
            else {
                low=middle+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] src = new int[]{1,3,5,7,8,9,10};
        System.out.println(binarySearch(src, 3));
    }
}
