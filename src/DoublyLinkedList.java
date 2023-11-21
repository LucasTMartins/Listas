class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        this.head = null;
    }

    void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }

        System.out.println("Valor inserido na lista duplamente encadeada: " + value);
    }

    void printList() {
        if (head == null) {
            System.out.println("A lista duplamente encadeada está vazia.");
        } else {
            System.out.println("Elementos da lista duplamente encadeada:");
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    void delete(int value) {
        if (head == null) {
            System.out.println("A lista duplamente encadeada está vazia. Nenhum elemento foi removido.");
        } else if (head.value == value) {
            head = head.next;
            head.previous = null;
            System.out.println("O valor " + value + " foi removido da lista duplamente encadeada.");
        } else {
            Node current = head;
            while (current.next != null && current.next.value != value) {
                current = current.next;
            }
            if (current.next == null) {
                System.out.println("O valor " + value + " não foi encontrado na lista duplamente encadeada. Nenhum elemento foi removido.");
            } else {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.previous = current;
                }
                System.out.println("O valor " + value + " foi removido da lista duplamente encadeada.");
            }
        }
    }
}