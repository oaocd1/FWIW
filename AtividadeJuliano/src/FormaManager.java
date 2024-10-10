import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private CorFactory corFactory = new CorFactory();

    private List<Forma> formas = new ArrayList<Forma>();

    public void addForma(String posicao, String cor, int tamanho) {
        if (posicao == null) {
            throw new IllegalArgumentException("Posição não pode ser nula");
        }
        if (cor == null) {
            throw new IllegalArgumentException("Cor não pode ser nula");
        }
        if (tamanho <= 0) {
            throw new IllegalArgumentException("Tamanho deve ser maior que zero");
        }
        formas.add(new Forma(posicao, corFactory.getCor(cor), tamanho));
    }

    public void mostrar() {
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}