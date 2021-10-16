package FundamentosJava.Section39ProjetoFinal;

public class DipositivosEntradas {
    String tipoEntrada;
    String marca;


    public DipositivosEntradas(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public DipositivosEntradas() {
        this.tipoEntrada = "Não especificado";
        this.marca = "Não especificado";
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DipositivosEntradas{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
