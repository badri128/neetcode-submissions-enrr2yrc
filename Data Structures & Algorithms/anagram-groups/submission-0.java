class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> r = new HashMap<>();  
        for(String s : strs){
            int[] c = new int[26];
            for(char ch : s.toCharArray()){
                c[ch-'a']++;
            }
            String k = Arrays.toString(c);
            r.putIfAbsent(k,new ArrayList<>());
            r.get(k).add(s);

        }
        return new ArrayList<>(r.values());
    }
}
