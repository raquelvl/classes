package criacao.classes;

import java.util.Objects;

/**
 * Um ovbjeto desta classe representa um produto de um estoque.
 * @author Turma de LP 2023.2
 * */
public class Produto {
    private String nome;
    private double preco;
    private long codigo;

    /**
     * Constró um objeto do tipo Produto.
     * @param nome      O nome do produto. O nome nao pode ser null ou vazio.
     * @param preco     O preço do produto. Não pode ser menor ou igual a 0.
     * @param codigo    O codigo do produto que pode ir de 0 até um número com 5 dígitos.
     * @throws Exception    Quando o nome é null ou vazio, preço negativo, código na faixa errada.
     */
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

    /**
     * Retorna o valor do nome do produto.
     * @return  O nome deste produto.
     */
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
        if(codigo >= 0 && codigo <= 99999)
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
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}