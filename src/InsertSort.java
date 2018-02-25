package Algorithm_Sort;

import java.util.ArrayList;
import java.util.List;

/**插入排序**/
public class InsertSort{
    public static void main(String args[]){
        //System.out.printf("Hello World");
        InsertSort insertSort = new InsertSort();
        double[] test = new double[]{5.8,98.6,360.9,25.7,46.9};
        test=insertSort.insertSort(test);
        for (double aTest : test) {
            System.out.println(aTest);
        }
//        List list = new ArrayList<>();
//        list.add(0,5);
//        list.add(1,89);
//        list.add(2,7);
//        list.add(3,15);
//        list.add(4,12);
//        list=insertSort.insertSort((ArrayList<Integer>) list);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
    }

    private int[] insertSort(int[] array){
        int temp=0;
        int j=0;
        if(array!=null&&array.length!=0){
            for(int i=1;i<array.length;i++){
//简单版不过时间复杂度高
//                for(int j=i;j>0;j--){
//                    if(array[j]<array[j-1]){
//                        temp=array[j];
//                        array[j]=array[j-1];
//                        array[j-1]=temp;
//                    }
//                }
                j=i;
                while (j>0 && array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    j--;
                }
            }
        }else {
            return array;
        }
        return array;
    }

    private double[] insertSort(double[] array){
        double temp=0;
        int j=0;
        if(array!=null&&array.length!=0){
            for(int i=1;i<array.length;i++){
//简单版不过时间复杂度高
//                for(int j=i;j>0;j--){
//                    if(array[j]<array[j-1]){
//                        temp=array[j];
//                        array[j]=array[j-1];
//                        array[j-1]=temp;
//                    }
//                }
                j=i;
                while (j>0 && array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    j--;
                }
            }
        }else {
            return array;
        }
        return array;
    }

    private List insertSort(ArrayList<Integer> arrayList){
        int j=0;
        int temp=0;
        if(arrayList!=null){
            for(int i=1;i<arrayList.size();i++){
                j=i;
                while (j>0 && arrayList.get(j)<arrayList.get(j-1)){
                    temp=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j-1));
                    arrayList.set(j-1,temp);
                }
            }
        }else {
            return arrayList;
        }
        return arrayList;
    }
}
