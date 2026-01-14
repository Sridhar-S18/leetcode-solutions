class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        while(sequence.contains(word.repeat(k +1))){
            k++;
        }

        return k;
    }
}