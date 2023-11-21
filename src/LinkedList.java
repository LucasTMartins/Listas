class LinkedList {
    Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Valor inserido na lista: " + value);
    }

    public void printList() {
        if (head == null) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Elementos da lista:");
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("A lista está vazia. Nenhum elemento foi removido.");
        } else if (head.value== value) {
            head = head.next;
            System.out.println("O valor " + value+ " foi removido da lista.");
        } else {
            Node current = head;
            while (current.next != null && current.next.value != value) {
                current = current.next;
            }
            if (current.next == null) {
                System.out.println("O valor " + value + " não foi encontrado na lista. Nenhum elemento foi removido.");
            } else {
                current.next = current.next.next;
                System.out.println("O valor " + value+ " foi removido da lista.");
            }
        }
    }
}