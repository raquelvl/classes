package criacao.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    private Produto produto;

    @BeforeEach
    void constroiProduto() throws Exception {
        produto = new Produto("Sabao", 12.93, 5032);
    }

    @Test
    void setNome() {
        //testa se nome atual está correto
        Assertions.assertEquals("Sabao", produto.getNome());

        //muda o nome atual para Sabao liquido
        produto.setNome("Sabao liquido");

        //testa se o novo nome do produto é Sabao liquido
        Assertions.assertEquals("Sabao liquido", produto.getNome());

        //muda o nome do produto para null
        produto.setNome(null);

        //testa que continua xpto
        Assertions.assertEquals("Sabao liquido", produto.getNome());

        produto.setNome("  ");
        Assertions.assertEquals("Sabao liquido", produto.getNome());
    }

    @Test
    void setPreco() {
        //testa se o preco inicial está correto
        Assertions.assertEquals(12.93, produto.getPreco());
        //muda preco para 0.01
        produto.setPreco(0.01);
        //testa se preco é 0.01
        Assertions.assertEquals(0.01, produto.getPreco());
        //muda o preço para 0
        produto.setPreco(0);
        //testa que continua 0.01
        Assertions.assertEquals(0.01, produto.getPreco());
        //muda o preço para -0.01
        produto.setPreco(-0.01);
        //testa que continua 0.01
        Assertions.assertEquals(0.01, produto.getPreco());
    }

    @Test
    void setCodigo() {
        //testa se o valor inicial esta correto
        Assertions.assertEquals(5032, produto.getCodigo());
        //muda o codigo para 99999
        produto.setCodigo(99999);
        //testa que o codigo é 99999
        Assertions.assertEquals(99999, produto.getCodigo());
        //muda codigo para 100000
        produto.setCodigo(100000);
        //testa que o codigo é 99999
        Assertions.assertEquals(99999, produto.getCodigo());
        //muda codigo para 0
        produto.setCodigo(0);
        //testa que o codigo é 0
        Assertions.assertEquals(0, produto.getCodigo());
        //muda codigo para -1
        produto.setCodigo(-1);
        //testa que o codigo é 0
        Assertions.assertEquals(0, produto.getCodigo());
        //muda codigo para 99998
        produto.setCodigo(99998);
        //testa que o codigo é 99998
        Assertions.assertEquals(99998, produto.getCodigo());
    }

    @Test
    void testEquals() {
        //
    }
}