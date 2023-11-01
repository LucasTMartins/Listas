import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores que quiser em sua lista. " +
                "\n(para parar pressione Enter sem nenhum valor)");

        while (true){
            lista.add(sc.nextInt());

        }
//            System.out.println("Escolha a opção desejada:" +
//                               "\n1- ");
    }
}
