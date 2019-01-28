package LinkList;

import Structure.SingleLinkList;

public class CircleSingleLinkList {
    //单链表是否有环
    public static boolean hasCircle(SingleLinkList head){
        if(head == null || head.getNext() == null)
            return false;
        SingleLinkList slow = head;
        SingleLinkList fast = head;
        while (fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast)
                return true;
        }
        return false;
    }
    //单链表环的长度
    public static int CircleLength(SingleLinkList head){
        if(head == null || head.getNext() == null)
            return 0;
        SingleLinkList slow = head;
        SingleLinkList fast = head;
        while (fast != null && fast.getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            while (fast == slow){
                int len = 0;
                fast = fast.getNext().getNext();
                slow = slow.getNext();
                while (fast != slow){
                    len ++;
                    fast = fast.getNext().getNext();
                    slow = slow.getNext();
                }
                return len;
            }
        }
        return 0;
    }
}
