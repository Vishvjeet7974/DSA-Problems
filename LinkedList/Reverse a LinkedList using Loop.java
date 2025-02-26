Node reverseList(Node head) {

    if (head == null || head.next == null)
        return head;

    Node pre = null;
    Node curr = head;

    while (curr != null) {
        Node next = curr.next;

        curr.next = pre;
        pre = curr;

        curr = next;
    }

    return pre;

}