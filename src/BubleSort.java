package Algorithm_Sort;

import java.util.ArrayList;
import java.util.List;
/*
从小到大排序
 */
public class BubleSort {
    public int[] bubleSort(int[] nums){
        int temp=0;
        for(int i=nums.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(nums[j]>nums[j+1]){
                   temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public double[] bubleSort(double[] nums){
        double temp=0;
        for(int i=nums.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public List bubleSort(ArrayList<Integer> arrayList){
        int temp=0;
        for(int i=arrayList.size();i>0;i--){
            for(int j=0;j<i-1;j++){
                if(arrayList.get(j)>arrayList.get(j+1)){
                    temp=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);

                }
            }
        }
        return arrayList;
    }
    public static void main(String[] args){
        BubleSort bubleSort = new BubleSort();
        ArrayList list = new ArrayList<>();
        list.add(0,5);
        list.add(1,89);
        list.add(2,7);
        list.add(3,15);
        list.add(4,12);
        list= (ArrayList) bubleSort.bubleSort(list);
        System.out.println(list);
    }
}
