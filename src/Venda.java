import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Venda {

    private Long id;

    private String descricaoVenda;

    private String nomeCliente;

    private String enderecoEntrega;

    private BigDecimal valorReal;

    private List<Produto> listaProdutos = new ArrayList<>();

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }


    public double tatalVenda(){
        double total = 0.0;
        for (Produto produto : listaProdutos){
            total += produto.getValor().doubleValue();
        }

        return total;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", descricaoVenda='" + descricaoVenda + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorReal=" + valorReal +
                ", listaProdutos=" + listaProdutos +
                '}';
    }
}
