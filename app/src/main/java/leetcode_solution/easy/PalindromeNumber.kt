package leetcode_solution.easy

class PalindromeNumber {

    /*
    *
    *  Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/


    fun isPalindrome(x: Int): Boolean {
        // return false if number is negative
        if (x < 0) return false
        var original = x
        var reversed  = 0
        while (original != 0){
            //  original%10 = give last digit of number
            reversed = reversed*10  + original%10
            //  original/10 = remove last digit from umber
            original = original/10
        }
        return x == reversed
    }
}