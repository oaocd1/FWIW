 package relatorio;

    public class Relatorio {
        private String titulo;
        private String descricao;
        private String rodape;

        public Relatorio(String titulo, String descricao, String rodape) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.rodape = rodape;
        }

        public Relatorio() {
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setRodape(String rodape) {
            this.rodape = rodape;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }



        @Override
        public String toString() {
            return titulo + "\n"
                    + descricao +
                    "\n " + rodape;
        }
    }

