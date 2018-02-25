package Algorithm_Sort;

import java.util.ArrayList;
import java.util.List;

public class ShellSort {
    public static void main(String[] args){
        ShellSort shellSort = new ShellSort();
        int[] test = new int[]{5,98,360,58,79,26,36,78,958,1,36,56,23};
        List list=new ArrayList<>();
        for(int i=0;i<test.length;i++){
            list.add(i,test[i]);
        }
        list=shellSort.shellSort((ArrayList<Integer>) list);
        //System.out.println(list.toString());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//       test=shellSort.shellSort(test);
//       for(int i =0;i<test.length;i++){
//           System.out.println(test[i]);
//       }
    }

    private int[] shellSort(int[] array){
        int temp=0;
        int k=0;
        int d=array.length;
        if(array.length > 0){
            while (d!=0){
                d=d/2;
                for(int i=0;i<d;i++){
                    for(int j=i+d;j<array.length;j+=d){
                        k=j-d;
                        temp=array[j];
                        while (k>=0 && temp<array[k]){
                            array[k+d]=array[k];
                            k-=d;
                        }
                        array[k+d]=temp;
                    }
                }
            }
        }
        return array;
    }

    private double[] shellSort(double[] array){
        double temp=0;
        int k=0;
        int d=array.length;
        if(array.length > 0){
            while (d!=0){
                d=d/2;
                for(int i=0;i<d;i++){
                    for(int j=i+d;j<array.length;j+=d){
                        k=j-d;
                        temp=array[j];
                        while (k>=0 && temp<array[k]){
                            array[k+d]=array[k];
                            k-=d;
                        }
                        array[k+d]=temp;
                    }
                }
            }
        }
        return array;
    }

    private List shellSort(ArrayList<Integer> arrayList){
        int temp=0;
        int k=0;
        int d=arrayList.size();
        if(arrayList.size()>0){
            while (d!=0){
                d=d/2;
                for(int i=0;i<d;i++){
                    for(int j=i+d;j<arrayList.size();j+=d){
                        k=j-d;
                        temp=arrayList.get(j);
                        while (k>=0 && temp<arrayList.get(k)){
                            arrayList.set(k+d,arrayList.get(k));
                            k-=d;
                        }
                        arrayList.set(k+d,temp);
                    }
                }
            }
        }
        return arrayList;
    }
}
