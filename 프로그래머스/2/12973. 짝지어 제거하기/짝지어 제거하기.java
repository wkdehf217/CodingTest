import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : ch) {
          if (stack.isEmpty()) {
            stack.push(c);
            continue;
          }

          if (!stack.isEmpty()) {
            if (stack.peek() == c) {
              stack.pop();
            } else {
              stack.push(c);
            }
          }
        }
        answer = stack.isEmpty() ? 1 : 0;
//         String[] split = s.split("");
        
//         ArrayList<String> arrList = new ArrayList<>(Arrays.asList(split));
        
//         for(int i=1;i<arrList.size();i++){
//           if(Objects.equals(arrList.get(i-1), arrList.get(i))){
//             arrList.remove(i-1);
//             arrList.remove(i-1);
//             i=0;
//           }
//         }

//      if(arrList.isEmpty()) answer = 1;
        return answer;
    }
}