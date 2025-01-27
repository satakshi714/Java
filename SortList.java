import java.util.*;

public class SortList{

    public static boolean isSorted(List<int[]> list){
        for(int i = 0; i < list.size(); i++){
            int[] prev = list.get(i-1);
            int[] curr = list.get(i);

            if(prev[0] > curr[0] || (prev[0] == curr[0] && prev[1] > curr[1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new int[]{a,b});
        }
        list.sort(Comparator.comparingInt((int[] pair) -> pair[0]).thenComparingInt(pair -> pair[1]));
        for(int[] i : list){
            System.out.println(i[0] + ", "+i[1]);
        }
    }
}