class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums) {
            if( map.containsKey(i) && map.get(i) >= 2) {
                return false;
            }

            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return true;
    }
}