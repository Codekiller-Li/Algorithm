package Algorithm_Sort;

import java.util.List;

/*
简单选择排序还没写完
 */
public class SelectSort {
    public static void main(String[] args){
        SelectSort selectSort = new SelectSort();
        int[] array = new int[]{8,7,6,3,3,9,8,7,5,6,11,23};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private int[] selectSort(int[] array){
        int min=0,temp=0;
        for(int i=0;i<array.length-1;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
        return array;
    }

    private double[] selectSort(double[] array){
        int min=0;
        double temp=0;
        for(int i=0;i<array.length-1;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
        return array;
    }

//    private List
}

