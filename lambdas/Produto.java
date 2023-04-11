public class Produto {

    String nome;
    Double valor;
    Double desconto;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Produto(String obj, double value, double desconto) {
        this.nome = obj;
        this.valor = value;
        this.desconto = desconto;
    }
}
