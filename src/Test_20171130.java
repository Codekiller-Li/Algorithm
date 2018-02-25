//import sun.awt.SunHints;
//
//public class Test_20171130 {
//    public int[] arraySort(String str,int[] num){
//        if(str.equals("DESC")){
//            num=shellSort_d(num);
//            for (int i=0;i<num.length;i++){
//                num[i]=numSort_d(num[i]);
//            }
//        }else if(str.equals("ASCE")){
//            num=shellSort(num);
//            for (int i=0;i<num.length;i++){
//                num[i]=numSort(num[i]);
//            }
//        }else{
//            return num;
//        }
//        return num;
//    }
//
//    private int[] shellSort(int[] array){
//        int temp=0;
//        int k=0;
//        int d=array.length;
//        if(array.length > 0){
//            while (d!=0){
//                d=d/2;
//                for(int i=0;i<d;i++){
//                    for(int j=i+d;j<array.length;j+=d){
//                        k=j-d;
//                        temp=array[j];
//                        while (k>=0 && temp<array[k]){
//                            array[k+d]=array[k];
//                            k-=d;
//                        }
//                        array[k+d]=temp;
//                    }
//                }
//            }
//        }
//        return array;
//    }
//
//    private int numSort(int num){
//        String str="";
//        str= String.valueOf(num);
//        int k=1,m=1,t=0,sum=0;
//        int length=str.length();
//        int[] temp = new int[length];
//        while (num!=0){
//            temp[t]=(num%(10*k))/k;
//            if(temp[t]==0){
//                num=num-temp[t]*k;
//            }else {
//                num=num-temp[t]*k;
//            }
//            k=k*10;
//            t=t+1;
//        }
//        temp=shellSort(temp);
//        for(int i=t-1;i>=0;i--){
//            if(temp[i]!=0){
//                sum=sum+temp[i]*m;
//                m=m*10;
//            }else {
//                break;
//            }
//        }
//        return sum;
//    }
//
//    private int numSort_d(int num){
//        String str="";
//        str= String.valueOf(num);
//        int k=1,m=1,t=0,sum=0;
//        int length=str.length();
//        int[] temp = new int[length];
//        while (num!=0){
//            temp[t]=(num%(10*k))/k;
//            if(temp[t]==0){
//                num=num-temp[t]*k;
//            }else {
//                num=num-temp[t]*k;
//            }
//            k=k*10;
//            t=t+1;
//        }
//        temp=shellSort_d(temp);
//        for(int i=t-1;i>=0;i--){
//            if(temp[i]!=0){
//                sum=sum+temp[i]*m;
//                m=m*10;
//            }else if(temp[i]==0){
//                sum=sum+0*m;
//                m=m*10;
//            }else {
//                continue;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        Test_20171130 test_20171130 = new Test_20171130();
////        String s = "ASCE";
////        int[] test = new int[]{568,87,36,603};
//        String s = "DESC";
//        int[] test = new int[]{568,87,36,603};
//        test=test_20171130.arraySort(s,test);
//        for(int i=0;i<test.length;i++){
//            System.out.println(test[i]);
//        }
//    }
//
//    private int[] shellSort_d(int[] array){
//        int temp=0;
//        int k=0;
//        int d=array.length;
//        if(array.length > 0){
//            while (d!=0){
//                d=d/2;
//                for(int i=0;i<d;i++){
//                    for(int j=i+d;j<array.length;j+=d){
//                        k=j-d;
//                        temp=array[j];
//                        while (k>=0 && temp>array[k]){
//                            array[k+d]=array[k];
//                            k-=d;
//                        }
//                        array[k+d]=temp;
//                    }
//                }
//            }
//        }
//        return array;
//    }
//}
