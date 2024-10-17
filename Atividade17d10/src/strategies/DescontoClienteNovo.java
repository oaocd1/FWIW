package strategies;



public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco; // Sem desconto para novos clientes
    }
}
