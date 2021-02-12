public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
        
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        Node runner = head;
        if(head != null){

            while(runner.next.next != null){
            runner = runner.next;
            }
            runner.next = null;

        }
    }

    public void removeAt(int value){
        Node runner = head;
        int counter = 1;
        while(runner.next != null && counter + 1 != value){
            runner = runner.next;
            counter ++;
        }
        
        runner.next = runner.next.next;
        
    }

    public void printValues(){
        Node runner = head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }


    public boolean find(int value){
        Node runner = head;
        while( runner != null){
            if( runner.value == value){
                return true;
                
            } else {     
                runner = runner.next;
            }
        }
        return false;
    }
    
}


