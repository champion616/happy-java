import java.util.List;
import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(10);

        for(int i : result){
            System.out.println(i);
        }
    }

    public int[] solution(int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        list.add(n);

        while(list.get(list.size()-1) != 1){
            int num = list.get(list.size()-1);

            if(num % 2 == 0){
                list.add(num/2);
            }else{
                list.add(3*num+1);
            }
        }

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}