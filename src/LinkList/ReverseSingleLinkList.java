package LinkList;

import Structure.SingleLinkList;

public class ReverseSingleLinkList {
    public static SingleLinkList Reverse(SingleLinkList head){
        SingleLinkList result = head;
        SingleLinkList cur = head;
        SingleLinkList prev = null;
        while (cur != null){
            cur.setNext(prev);
            prev = cur;
            cur = cur.getNext();
        }
        return result;
    }
}
