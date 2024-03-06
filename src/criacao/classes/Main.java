package criacao.classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();
        String nome = recebeNome(sc);
        try {
            estoque.adicionaProduto(nome, 0, 0);
        } catch(Exception e) {
            System.err.println(e);
            System.out.println("Informe um nome valido");
            estoque.adicionaProduto(recebeNome(sc), 0, 0);
        }
        System.out.println("DEU TUDO CERTO!");
    }

    private static String recebeNome(Scanner sc) {
        System.out.println("informe o  nome do produto");
        return sc.nextLine();

    }
}
