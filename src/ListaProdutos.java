
import java.util.ArrayList;

public class ListaProdutos {
    ArrayList<Produto> listaProduto = new ArrayList<>();

    public void mostrarLista(){
        for (int i = 0; i < listaProduto.size(); i++) {
            System.out.println(listaProduto.get(i));
        }
    }
}
