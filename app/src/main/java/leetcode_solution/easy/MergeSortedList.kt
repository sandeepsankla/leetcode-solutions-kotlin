package leetcode_solution.easy


/**
* Example:
* var li = ListNode(5)
* var v = li.`val`
* Definition for singly-linked list.
*/
class ListNode(var `val`: Int) {
         var next: ListNode? = null
     }

class MergeSortedList {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var current = dummyHead
        var l1 = list1
        var l2 = list2

        while(l1 != null && l2 != null){
            if(l1!!.`val` < l2!!.`val` ){
                current.next = l1
                l1 = l1.next
                current = current.next!!
            }
            else if(l2!!.`val`< l1!!.`val`){
                current.next = l2
                l2 = l2.next
                current = current.next!!
            }else{
                current.next = l1
                l1 = l1.next
                current = current.next!!
                current.next = l2
                l2 = l2.next
                current = current.next!!
            }

        }
        if(l1 != null){
            current.next = l1
            l1 = l1.next
        }
        if(l2 != null){
            current.next = l2
            l2 = l2.next
        }
        return dummyHead.next
    }}