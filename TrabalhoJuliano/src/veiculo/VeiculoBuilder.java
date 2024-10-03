package veiculo;

public class VeiculoBuilder {
    private Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(Integer quantidade){
        this.veiculo.setRodas(quantidade);
        return this;
    }

    public Veiculo build(){
        return this.veiculo;
    }
}
