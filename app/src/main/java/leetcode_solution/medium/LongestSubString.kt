package leetcode_solution.medium

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) return 0
        else if(s.length==1 ) return 1
        var left = 0
        var maxLen = 0
        val charIndexMap = hashMapOf<Char, Int>()
        for(right in s.indices){

            val currentChar = s[right]
            if(charIndexMap.containsKey(currentChar) && charIndexMap[currentChar]!! >=left){
                left = charIndexMap[currentChar]!! + 1
            }
            charIndexMap[currentChar] = right
            maxLen = maxOf(maxLen, right - left + 1)

        }
        return maxLen

    }
}