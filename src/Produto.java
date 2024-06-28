public class Produto implements Comparable<Produto> {

    private String nomeProd;
    private String descricaoProd;
    private double valorProd;
    private boolean isDisponivel;

    public Produto() {
    }

    public Produto(String nomeProd, String descricaoProd, double valorProd, boolean disponivel) {
        this.nomeProd = nomeProd;
        this.descricaoProd = descricaoProd;
        this.valorProd = valorProd;
        this.isDisponivel = disponivel;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public boolean isDisponivel(boolean isDisponivel) {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    @Override
    public String toString() {

        return "Nome: " + nomeProd.toUpperCase() + " valor: R$ " +  valorProd;
    }

    @Override
    public int compareTo(Produto produto2) {
        return (int) (this.valorProd - produto2.getValorProd());
    }
}
