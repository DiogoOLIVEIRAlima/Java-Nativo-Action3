import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarrinhoDeComprasImpl implements CarrinhoDeCompras, TotalCarrinho{
    private List<ItemDeCompra> itens;

    public CarrinhoDeComprasImpl() {
        this.itens = new ArrayList<>();
    }

    public List<ItemDeCompra> getItens() {
        return itens;
    }

    public void adicionarItem(ItemDeCompra item){
        itens.add(item);
    }

    public double calcularTotal(){
        double valor = 0;
        for ( ItemDeCompra x : itens){
            valor += x.getPreco();
        }
        return valor;
    }
    @Override
    public String toString() {
        return "CarrinhoDeComprasImpl{" +
                "itens=" + itens +
                '}';
    }
}
