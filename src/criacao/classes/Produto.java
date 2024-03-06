package criacao.classes;

public class Produto {
    private String nome;
    private double preco;
    private long codigo;

    public Produto(String nome, double preco, long codigo) throws Exception {
        if(nome == null || nome.trim().isEmpty())
            throw new Exception("Nome nao pode ser nulo ou vazio.");
        this.nome = nome;
        if(preco < 0)
            throw new Exception("Preco nao pode ser negativo.");
        this.preco = preco;
        if(codigo < 0 || codigo > 99999)
            throw new Exception("Codigo nao pode ser um numero com mais de 5 digitos.");
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty())
            return;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        if (Double.compare(produto.getPreco(), getPreco()) != 0) return false;
        if (getCodigo() != produto.getCodigo()) return false;
        return getNome() != null ? getNome().equals(produto.getNome()) : produto.getNome() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNome() != null ? getNome().hashCode() : 0;
        temp = Double.doubleToLongBits(getPreco());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getCodigo() ^ (getCodigo() >>> 32));
        return result;
    }
}