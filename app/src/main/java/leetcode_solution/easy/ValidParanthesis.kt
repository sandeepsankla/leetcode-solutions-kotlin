package leetcode_solution.easy

import java.util.Deque

class ValidParanthesis {

    fun isValid(s: String): Boolean {
        val stack  = ArrayDeque<Char>()
        val mappings  = hashMapOf<Char,Char>(']' to '[', '}'  to '{', ')' to '(')
        for (ch in s){
            // check if it is opening bracket if yes push it in stack
            if(ch in mappings.values){
                stack.add(ch)
            }
            // if it is closed bracket then remove the last element of stack and match their pair, if matches return true
            else if(stack.isEmpty()) return false
            else {
                val openBracket = stack.removeLast()
                // Check if the opening bracket matches
                if(mappings[ch]!=openBracket) return false

            }
        }
        return stack.isEmpty()
    }

}