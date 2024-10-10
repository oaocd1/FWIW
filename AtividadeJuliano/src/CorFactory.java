import java.util.HashMap;

public class CorFactory {
    private HashMap<String, Cor> cores = new HashMap<String, Cor>();

    public Cor getCor(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome da cor não pode ser nulo");
        }
        Cor cor = cores.get(nome);
        if (cor == null) {
            cor = new Cor(nome);
            cores.put(nome, cor);
        }
        return cor;
    }
}