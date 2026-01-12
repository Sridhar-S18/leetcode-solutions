class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String i:operations){
            if(i.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            }
            else if(i.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if(i.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(i));
            }
        }

        int sum = 0;
        for(int val:stack){
            sum += val;
        }

        return sum;
    }
}