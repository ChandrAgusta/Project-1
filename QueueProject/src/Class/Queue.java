package Class;

public class Queue {

    private SingleLinkedList queue;
    private int size;

    public Queue() {
        queue = new SingleLinkedList();
        size = 0;
    }

    public void enqueue(HairArtist data) {
        queue.addLast(data);
        size++;
    }

    public ListNode dequeue() {
        size--;
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return size;
    }
    
    public ListNode getFirst(){
        return queue.getFirst();
    }
    
    public ListNode getLast(){
        return queue.getLast();
    }
    
    public ListNode search(String data){
        return queue.search(data);
    }
    
    public ListNode searchJam(String data){
        return queue.searchJam(data);
    }
    
    @Override
    public String toString() {
        String content = "";
        if (!isEmpty()) {
            ListNode help = queue.getFirst();
            while (help != null) {
                content = content + "\no " + help;
                help = help.getNext();
            }
        }
        return content;
    }
}
