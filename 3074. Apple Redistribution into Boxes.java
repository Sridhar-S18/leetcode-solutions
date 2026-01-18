class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int[] hash = new int[51];
        int sum = 0, ans = 0;
        for(int i:apple) sum += i;

        for(int i:capacity) hash[i]++;

        for(int i = 50;i>0;i--) {
            while(hash[i] > 0){
                sum -= i;
                hash[i]--;
                ans++;
                if(sum <= 0) return ans;
            }
        }
        return ans;
    }
}