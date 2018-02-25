import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Rank {
    public static void listAllA(List<Integer> candidate, String prefix){
        if(prefix.length()!=0){
            System.out.println(prefix);
        }
        for(int i=0; i<candidate.size(); i++){

            List<Integer> temp = new LinkedList<Integer>(candidate);
            int item = (int)temp.remove(i);
            listAllA(temp, prefix+item);
        }
    }

    public static void listAllB(List<Integer> candidate, String prefix, HashSet<String> hs){
        if(prefix.length()!=0 && !hs.contains(prefix)){
            System.out.println(prefix);
            hs.add(prefix);
        }
        for(int i=0; i<candidate.size(); i++){

            List<Integer> temp = new LinkedList<Integer>(candidate);
            int item = (int)temp.remove(i);
            listAllB(temp, prefix+item, hs);
        }
    }

    public static void listAllC(List<Integer> candidate, String prefix){
        if(candidate.size()==0 && prefix.length()!=0){
            System.out.println(prefix);
        }


        for(int i=0; i<candidate.size(); i++){

            List<Integer> temp = new LinkedList<Integer>(candidate);
            int item = (int)temp.remove(i);
            listAllC(temp, prefix+item);
        }
    }

    public static void listAllD(List<Integer> candidate, String prefix, HashSet<String> hs){
        if(candidate.size()==0 && prefix.length()!=0 && !hs.contains(prefix)){
            System.out.println(prefix);
            hs.add(prefix);
        }


        for(int i=0; i<candidate.size(); i++){

            List<Integer> temp = new LinkedList<Integer>(candidate);
            int item = (int)temp.remove(i);
            listAllD(temp, prefix+item, hs);
        }
    }

    public static void main(String[] args){
        /**
         * 无重复元素组合
         */
        Integer[] array = {1,2};
        List<Integer> list = Arrays.asList(array);
        listAllA(list, "");
        /**
         * 有重复元素组合
         */
//        Integer[] array = {1,1,2};
//        List<Integer> list = Arrays.asList(array);
//        HashSet<String> hs = new HashSet<String>();
//        listAllB(list, "", hs);
        /**
         * 无重复元素排列
         */
//        Integer[] array = {1,2};
//        List<Integer> list = Arrays.asList(array);
//        listAllC(list, "");
        /**
         * 有重复元素组合
         */
//        Integer[] array = {1,1,2};
//        List<Integer> list = Arrays.asList(array);
//        HashSet<String> hs = new HashSet<String>();
//        listAllD(list, "", hs);
    }

}
