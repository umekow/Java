public class ListNode{

    public int data; 
    public ListNode next; 
    
    public ListNode(){
        this(0, null); 
    }

    public ListNode(int data){
        this(data, null); 
    }

    public ListNode(int data, ListNode next){
        this.data  = data; 
        this.next = next; 
    }

    public static void main(String[] args){
        ListNode list = new ListNode(3, ); 
        list.data = 3; 
        list.next = new ListNode(); 
        list.next.data = 4; 
        list.next.next = new ListNode(); 
        list.next.next.data = 5; 

        System.out.println(list.data + " " + list.next.data + " " +  list.next.next.data); 
    }
}