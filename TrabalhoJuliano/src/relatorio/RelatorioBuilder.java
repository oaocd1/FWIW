package relatorio;

public class RelatorioBuilder {
    private Relatorio relatorio = new Relatorio();

    public RelatorioBuilder() {
    }

    public RelatorioBuilder setDescricao(String descricao) {
        relatorio.setDescricao(descricao);
        return this;
    }

    public RelatorioBuilder setTitulo(String titulo) {
        relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setRodape(String rodape) {
        relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build() {
        return relatorio;
    }
}