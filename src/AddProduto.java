import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AddProduto {

    public void AddProduto() throws ParseException {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        ListaProdutos listaProdutos = new ListaProdutos();
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("________Cadastrando produto______");
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();
        produto.setNomeProd(nome);
        System.out.println("Descrição: ");
        String descr = scanner.nextLine();
        produto.setDescricaoProd(descr);
        System.out.println("Valor: ");
        double valor;
        try {
            valor = scanner.nextDouble();
            produto.setValorProd(valor);
        } catch (InputMismatchException e) {
            valor = numberFormat.parse(scanner.nextLine()).doubleValue();
            produto.setValorProd(valor);
        }
        System.out.println("Produto disponivel? 1.Sim / 2.Nao ");
        int disp = scanner.nextInt();
        if (disp == 1) {
            produto.setDisponivel(produto.isDisponivel(true));
            listaProdutos.listaProduto.add(new Produto(nome, descr, valor, produto.isDisponivel(true)));
            for (int i = 0; i < listaProdutos.listaProduto.size(); i++) {
                Collections.sort(listaProdutos.listaProduto);
                System.out.println(listaProdutos.listaProduto.get(i));
                System.out.println("_____________________________");
            }
        } else {
            produto.setDisponivel(produto.isDisponivel(false));
            listaProdutos.listaProduto.add(new Produto(nome, descr, valor, produto.isDisponivel(false)));
            for (int i = 0; i < listaProdutos.listaProduto.size(); i++) {
                Collections.sort(listaProdutos.listaProduto);
                System.out.println(listaProdutos.listaProduto.get(i));
            }
            System.out.println("--------------------------------------------");
        }
    }
}
