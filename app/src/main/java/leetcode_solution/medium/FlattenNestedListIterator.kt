package leetcode_solution.medium


  // This is the interface that allows for creating nested lists.
 // You should not implement it, or speculate about its implementation
  class NestedInteger {
   /*   // Constructor initializes an empty nested list.
      constructor()
 
      // Constructor initializes a single integer.
      constructor(value: Int)
 
      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      fun isInteger(): Boolean
 
      
      // Set this NestedInteger to hold a single integer.
 *     fun setInteger(value: Int): Unit
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     fun add(ni: NestedInteger): Unit
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer*/
     fun getList(): List<NestedInteger>?{
         /// implement logic here
         return null
     }

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      fun getInteger(): Int?{
          /// implement logic here
          return null
      }

  }

class NestedIterator(nestedList: List<NestedInteger>) {
    val flatenedList = mutableListOf<Int>()
    var currentIndex = -1

    init{
        flatten(nestedList)
    }
    fun next(): Int {
        currentIndex++
        return flatenedList[currentIndex]
    }

    fun hasNext(): Boolean {
        return currentIndex +1 < flatenedList.size
    }
    fun flatten(nestedList: List<NestedInteger>){
        for(item in nestedList){
            if(item.getInteger() != null ) flatenedList.add(item.getInteger()!!)
            else flatten(item.getList()!!)
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */