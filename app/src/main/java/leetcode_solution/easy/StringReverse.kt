package leetcode_solution.easy

class Solution {
    fun reverseString(s: CharArray): Unit {
        val len = s.size -1
        (0..len/2).forEach{index->
            val temp = s[index]
            s[index] = s[len-index]
            s[len-index] = temp
        }
    }
}