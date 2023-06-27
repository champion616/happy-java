import java.util.List;
import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        Solution s = new Solution();
        int[] result = s.solution(arr);

        for(int i : result){
            System.out.println(i);
        }
    }

    public int[] solution(int[] arr) {
        int[] stk = {};

        List<Integer> list = new ArrayList<>();

        int i = 0;
        for(int j=0; i<arr.length; j++){
            int size = list.size();
            if(size == 0){
                list.add(arr[i]);
                i++;
            }else if((size>=1) && (list.get(size-1).intValue()<arr[i])){
                list.add(arr[i]);
                i++;
            }else if((size>=1) && (list.get(size-1).intValue()>=arr[i])){
                list.remove(size-1);
            }
        }

        stk = new int[list.size()];
        for(int j=0; i<list.size(); j++){
            stk[j] = list.get(j).intValue();
        }

        return stk;
    }
}