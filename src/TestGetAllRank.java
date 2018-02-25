import java.util.ArrayList;
import java.util.List;
public class TestGetAllRank {
    public static void main(String[] args) {

//        List<Integer> s=new ArrayList<Integer>();
//        List<Integer> rs=new ArrayList<Integer>();
//        for(int i=1;i<=3;i++)
//            s.add(i);
//        TestGetAllRank testGetAllRank = new TestGetAllRank();
//        testGetAllRank.pl(s,rs);


//        int n=3;
//        List<Character> s=new ArrayList<Character>();
//        List<Character> rs=new ArrayList<Character>();
//        for(int i=0;i<n;i++){
//            s.add('(');
//            s.add(')');
//        }
//        getAllRank(s,rs);

//        TestGetAllRank testGetAllRank = new TestGetAllRank();
//        List<Integer> s=new ArrayList<Integer>();
//        for(int i=0;i<4;i++){
//            s.add(i,i+1);
//        }
//        testGetAllRank.getRank(s,1);

//        String s ="abc";
//        cs=s.toCharArray();
//        rePerm(s.toCharArray(),0);
    }
    public void pl(List<Integer> s,List<Integer> rs){
        if(s.size()==1)
        {
            rs.add(s.get(0));
            System.out.println(rs.toString());
            rs.remove(rs.size()-1);
        }else{
            for(int i=0;i<s.size();i++){
                rs.add(s.get(i));
                List<Integer> tmp=new ArrayList<Integer>();
                for(Integer a:s)
                    tmp.add(a);
                tmp.remove(i);
                pl(tmp,rs);
                rs.remove(rs.size()-1);
            }
        }
    }

    public static void getAllRank(List<Character> s,List<Character> rs){
        if(s.size()==1)
        {
            rs.add(s.get(0));
            System.out.println(rs.toString());
            rs.remove(rs.size()-1);
        }else{
            for(int i=0;i<s.size();i++){
                rs.add(s.get(i));
                List<Character> tmp=new ArrayList<Character>();
                for(Character a:s)
                    tmp.add(a);
                tmp.remove(i);
                getAllRank(tmp,rs);
                rs.remove(rs.size()-1);
            }
        }
    }
    private void getRank(List<Integer> input,int length){
        //input代表数字个数，m代表字符串长度
//        int count=0;//统计排列的数目
        List<Integer> arr = new ArrayList<>();//用于判断数组中是否有重复的数,为1时没有，否则为0;
        int i=0;
        arr.add(0,1);
        while(true){
            if(i == length - 1){
                outputResult(arr,length);
//                count++;
            }
            if(i < length - 1){
                i++;
                arr.add(i,1);////每个都要从1开始
                continue;
            }
            while(arr.get(i)==input.get(input.size()-1)) {
                i--;
                if(i<0){
                    break;
                }
            }
            if(i>=0){
                arr.add(i,arr.get(i)+1);
            } else{
                break;
            }
        }
//        System.out.println(count);//输出总的数目
    }
    private void outputResult(List<Integer> arr,int length){
        String s="";
        for(int i=0;i<length;i++){
            s=s+arr.get(i)+"";
        }
        System.out.println(s);
    }

    public static char[] cs;
    private static void rePerm(char[] str,int pos) {
        if (pos == str.length-1) {
            for (int i = 0; i < str.length; i++) {
                str[pos] = cs[i];
                System.out.println(str);
            }
            return;
        }
        for (int i = 0; i < str.length; i++) {
            str[pos] = cs[i];
            rePerm(str, pos + 1);
        }
    }


}
