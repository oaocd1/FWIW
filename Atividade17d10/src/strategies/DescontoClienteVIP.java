package strategies;

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.80; // 20% de desconto
    }
}
