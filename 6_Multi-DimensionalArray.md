Multi-Dimensional Array:
    A multi-dimensional array is an array inside another array

eg:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


Contains Duplicate
------------------------
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet();
        for(int n:nums){
            if(a.contains(n)){
                return true;
            }
            a.add(n);
        }

        return false;
    }
}


Contains Duplicate II
-------------------------
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}

Group Anagrams:
---------------
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String ,List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            List<String> stringList = map.get(sortedString);
            if(stringList == null) {
                stringList = new ArrayList<>();
                map.put(sortedString, stringList);
            }
            stringList.add(str);
        }

        for(List<String> lst : map.values()) {
            result.add(lst);
        }
        return result;
    }
}