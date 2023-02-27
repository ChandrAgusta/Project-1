package Class;

public class SingleLinkedList {

    private ListNode first, last;

    public SingleLinkedList() {
        first = null;
        last = null;
    }

    public ListNode getFirst() {
        return first;
    }

    public void setFirst(ListNode first) {
        this.first = first;
    }

    public ListNode getLast() {
        return last;
    }

    public void setLast(ListNode last) {
        this.last = last;
    }

    public void addFirst(HairArtist data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void addLast(HairArtist data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public ListNode removeFirst() {
        ListNode help;

        if (!isEmpty()) {
            if (first == last) {
                help = first;
                last = first = null;
                return help;
            } else {
                help = first;
                first = first.getNext();
                return help;
            }
        } else {
            return null;
        }
    }

    public ListNode removeLast() {
        ListNode help;

        if (!isEmpty()) {
            if (first == last) {
                help = first;
                last = first = null;
                return help;
            } else {
                help = first;
                while (help.getNext() != last) {
                    help = help.getNext();
                }
                last = help;
                help = help.getNext();
                last.setNext(null);
                return help;
            }
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
    
    public ListNode search(String data) {
        ListNode key = first;

        if (!isEmpty()) {
            while (key.getNext() != null) {
                if (key.getData().getNama().equals(data)) {
                    return key;
                }
                key = key.getNext();
            }
            if (key.getData().getNama().equals(data)) {
                return key;
            }
        }
        return null;
    }
    
    public ListNode searchJam(String data) {
        ListNode key = first;

        if (!isEmpty()) {
            while (key.getNext ()!= null) {
                if (key.getData().getJam().equals(data)) {
                    return key;
                }
                key = key.getNext();
            }
            if (key.getData().getJam().equals(data)) {
                return key;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return String.valueOf(first);
    }
}
