package veiculo;

import java.util.ArrayList;
    public class Veiculo {
        private String tipo = "";

        private String cor = "";

        private Integer rodas;

        public Veiculo(){ }

        public Veiculo(String cor, String tipo) {
            this.cor = cor;
            this.tipo = tipo;

        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setRodas(Integer rodas) {
            this.rodas = rodas;
        }

        @Override
        public String toString(){
            return "Tipo: " + this.tipo + " " +
                    "Cor: " + this.cor + " " +
                    "Rodas: " + this.rodas;
        }
    }

