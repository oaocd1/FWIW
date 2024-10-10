public class Forma {
    private Cor cor;
    private String posicao;
    private int tamanho;

    public Forma(String posicao, Cor cor, int tamanho) {
        this.posicao = posicao;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Forma [posicao=" + posicao + ", corObject="+ cor + ", cor=" + cor.getNome() + ", tamanho=" + tamanho + "]";
    }
}