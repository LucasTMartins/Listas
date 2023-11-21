import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        DoublyLinkedList listaDupla = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        Integer opcao = -1;

        while (opcao != 0) {
            System.out.println();
            System.out.println("Selecione uma opção:"
                + "\n 1. Inserir na lista simplesmente encadeada"
                + "\n 2. Inserir na lista duplamente encadeada"
                + "\n 3. Excluir elemento da lista"
                + "\n 4. Listar elementos da lista simplesmente encadeada"
                + "\n 5. Listar elementos da lista duplamente encadeada"
                + "\n 0. Sair");

            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido na lista simplesmente encadeada: ");
                    int simpleValue = sc.nextInt();
                    lista.add(simpleValue);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser inserido na lista duplamente encadeada: ");
                    int doubleValue = sc.nextInt();
                    listaDupla.add(doubleValue);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser excluído das listas: ");
                    int valorExcluir = sc.nextInt();
                    lista.delete(valorExcluir);
                    listaDupla.delete(valorExcluir);
                    break;
                case 4:
                    lista.printList();
                    break;
                case 5:
                    listaDupla.printList();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}