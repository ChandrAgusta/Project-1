package Class;

public class ListNode {

    private HairArtist data;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(HairArtist data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(HairArtist data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public HairArtist getData() {
        return data;
    }

    public void setData(HairArtist data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
