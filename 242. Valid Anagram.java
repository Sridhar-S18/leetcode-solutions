class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(char c:s.toCharArray()){
        map.put(c, map.getOrDefault(c,0) + 1);
       }

       for(char i:t.toCharArray()){
        map.put(i,map.getOrDefault(i, 0) - 1);
       }

       for(int y:map.values()){
        if(y != 0){
            return false;
        }
       }

       return true;
    }
}