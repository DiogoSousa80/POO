import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigDecimal;

public class ExecultarTeste {
    public static void main(String... Args){

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Módulo Orientação Objeto");
        produto1.setValor(BigDecimal.valueOf(99.99));

        Produto produto2 = new Produto();
        produto2.setNome("Spring Boot REST API");
        produto2.setId(2L);
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setNome("SQL");
        produto3.setId(2L);
        produto3.setValor(BigDecimal.valueOf(500));



        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Java");
        venda.setEnderecoEntrega("Entregar pelo Imail");
        venda.setId(10L);
        venda.setNomeCliente("Diogo Sousa");
        venda.setValorReal(BigDecimal.valueOf(99.99));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.getListaProdutos().add(produto3);
        System.out.println("Descrição da venda : "
        + venda.getDescricaoVenda() + " e o total: " +
                + venda.tatalVenda());




    }


}
