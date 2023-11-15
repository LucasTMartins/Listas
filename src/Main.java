import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        Integer value;
        Boolean valid_value = true;

        System.out.println("Digite os valores que quiser em sua lista. " +
                "\n(para parar insira um)");
        // System.out.println("Digite os valores que quiser em sua lista. " +
        //         "\n(para parar insira um)");

        while (valid_value){
            value = sc.nextInt();
            lista.add(value);
        }
    }
}
