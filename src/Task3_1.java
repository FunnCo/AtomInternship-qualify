public class Task3_1 {
    private class Node {

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int value;
        public Node next;
    }

    public Node reverseList(Node node){
        if(node == null){
            return null;
        }
        if(node.next != null){
            Node nextNode = reverseList(node.next);
            node.next.next = node;
            node.next = null;
            return nextNode;
        } else {
            return node;
        }
    }

    public void printLinkedList(Node firstNode){
        Node currentNode = firstNode;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void solve() {
        // Создание тестового списка
        Node n6 = new Node(6);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        System.out.println("Before inversion");
        printLinkedList(n1);
        reverseList(n1);
        System.out.println("After inversion");
        printLinkedList(n6);
    }

    public static void main(String[] args) {
        (new Task3_1()).solve();
    }

}
