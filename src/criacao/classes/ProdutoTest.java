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
        assertEquals("Sabao", produto.getNome());

        //muda o nome atual para Sabao liquido
        produto.setNome("Sabao liquido");

        //testa se o novo nome do produto é Sabao liquido
        assertEquals("Sabao liquido", produto.getNome());

        //muda o nome do produto para null
        produto.setNome(null);

        //testa que continua xpto
        assertEquals("Sabao liquido", produto.getNome());

        produto.setNome("  ");
        assertEquals("Sabao liquido", produto.getNome());
    }

    @Test
    void setPreco() {
        //testa se o preco inicial está correto
        assertEquals(12.93, produto.getPreco());
        //muda preco para 0.01
        produto.setPreco(0.01);
        //testa se preco é 0.01
        assertEquals(0.01, produto.getPreco());
        //muda o preço para 0
        produto.setPreco(0);
        //testa que continua 0.01
        assertEquals(0.01, produto.getPreco());
        //muda o preço para -0.01
        produto.setPreco(-0.01);
        //testa que continua 0.01
        assertEquals(0.01, produto.getPreco());
    }

    @Test
    void setCodigo() {
        //testa se o valor inicial esta correto
        assertEquals(5032, produto.getCodigo());
        //muda o codigo para 99999
        produto.setCodigo(99999);
        //testa que o codigo é 99999
        assertEquals(99999, produto.getCodigo());
        //muda codigo para 100000
        produto.setCodigo(100000);
        //testa que o codigo é 99999
        assertEquals(99999, produto.getCodigo());
        //muda codigo para 0
        produto.setCodigo(0);
        //testa que o codigo é 0
        assertEquals(0, produto.getCodigo());
        //muda codigo para -1
        produto.setCodigo(-1);
        //testa que o codigo é 0
        assertEquals(0, produto.getCodigo());
        //muda codigo para 99998
        produto.setCodigo(99998);
        //testa que o codigo é 99998
        assertEquals(99998, produto.getCodigo());
    }

    @Test
    void testEquals() throws Exception {
        assertEquals(new Produto("Sabao Liquido", 12.94, 5032), produto);
        Produto produto2 = produto;
        assertEquals(produto2, produto);
        assertNotEquals(new Produto("Sabao Liquido", 12.94, 5033), produto);
    }

    @Test
    void TestConstrutor() {
        try {
            Produto produto1 = new Produto(null, 0, 0);
            fail("Devia ter lancado excecao");
        } catch (Exception exception) {
            assertEquals("Nome nao pode ser nulo ou vazio.", exception.getMessage());
        }
    }

    @Test
    void testConstrutor2() {
        Exception exception = assertThrows(Exception.class, () -> {
            Produto produto1 = new Produto(" ", 0, 0);
        });

        assertTrue("Nome nao pode ser nulo ou vazio.".equals(exception.getMessage()));
    }
}