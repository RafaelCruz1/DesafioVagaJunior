import java.util.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            ArrayList<Produto> listagem = new ArrayList<>();

            Produto produto = new Produto();
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);

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
                    System.out.println("________Cadastrando produto______");
                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Descrição: ");
                    String descr = scanner.nextLine();
                    System.out.println("Valor: ");
                    double valor;
                    try {
                        valor = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        valor = numberFormat.parse(scanner.nextLine()).doubleValue();
                    }
                    System.out.println("Produto disponivel? 1.Sim / 2.Nao ");
                    int disp = scanner.nextInt();
                    if (disp == 1) {
                        produto.isDisponivel(true);
                        listagem.add(new Produto(nome, descr, valor, produto.isDisponivel(produto.isDisponivel(true))));
                        for (int i = 0; i < listagem.size(); i++) {
                            Collections.sort(listagem);
                            System.out.println(listagem.get(i));
                            System.out.println("_____________________________");
                        }
                    } else {
                        listagem.add(new Produto(nome, descr, valor, produto.isDisponivel(produto.isDisponivel(false))));
                        for (int i = 0; i < listagem.size(); i++) {
                            Collections.sort(listagem);
                            System.out.println(listagem.get(i));
                        }
                        System.out.println("--------------------------------------------");
                    }
                } else {
                    if (listagem.isEmpty()) {
                        System.out.println("A lista esta vazia. ");
                    }
                    Collections.sort(listagem);
                    for (int i = 0; i < listagem.size(); i++) {
                        System.out.println(listagem.get(i));
                    }
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