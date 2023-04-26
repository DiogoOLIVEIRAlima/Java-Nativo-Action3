import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemDeCompra item = new ItemDeCompra("Iphone", 2);
        ItemDeCompra item2 = new ItemDeCompra("Mouse", 1);

        CarrinhoDeComprasImpl carrinhoDeCompras = new CarrinhoDeComprasImpl();
        carrinhoDeCompras.adicionarItem(item);
        carrinhoDeCompras.adicionarItem(item2);

        System.out.println(carrinhoDeCompras.calcularTotal());
    }
}