import servicos.CarrinhoDeCompras;
import entidades.Produto;
import strategies.DescontoClienteNovo;
import strategies.DescontoClienteRegular;
import strategies.DescontoClienteVIP;

public class LojaOnline {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Novo cliente
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Novo Cliente: " + carrinho.calcularTotal());

        // Cliente Regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: " + carrinho.calcularTotal());

        // Cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: " + carrinho.calcularTotal());
    }
}

