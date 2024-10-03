package pizza;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class Pizza {
    private String massa = "";

    private String tamanho = "";

    private ArrayList<String> ingredientes = new ArrayList<>();

    public Pizza(){ }

    public Pizza(String massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;

    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }


    @Override
    public String toString(){
        return "Massa: " + this.massa + " " +
                "Tamanho: " + this.tamanho + " " +
                "Ingrediente: " + this.ingredientes;
    }
}
