import java.util.*;

public class Main {
    public static void main(String[] args) {
        AddProduto addProduto = new AddProduto();
        ListaProdutos listaProdutos = new ListaProdutos();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("============Sistema inicializado===========");
            System.out.println();
            System.out.println("1. Para realizar algum comando. ");
            System.out.println("2. Para encerrar o programa. ");

            int resp = scanner.nextInt();
            scanner.nextLine();
            System.out.println("______________________________________");

            while (resp == 1) {
                System.out.println("1. Adicionar algum produto. ");
                System.out.println("2. Ver a Lista. ");
                int resposta = scanner.nextInt();
                scanner.nextLine();
                if (resposta == 1) {
                    addProduto.AddProduto();
                } else {
                    if (listaProdutos.listaProduto.isEmpty()) {
                        System.out.println("A lista esta vazia. ");
                    }
                    listaProdutos.mostrarLista();
                    System.out.println("----------------------------");
                }
                System.out.println("Deseja realizar outro comando? 1.Sim / 2.Nao");
                resp = scanner.nextInt();
                scanner.nextLine();
                System.out.println("--------------------------------------");
                if (resp == 2) {
                    System.out.println("Certeza? 1.Sim / 2.Nao");
                    int confirmar = scanner.nextInt();
                    if (confirmar == 1) {
                        System.out.println("Encerrando programa.");
                        scanner.close();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}