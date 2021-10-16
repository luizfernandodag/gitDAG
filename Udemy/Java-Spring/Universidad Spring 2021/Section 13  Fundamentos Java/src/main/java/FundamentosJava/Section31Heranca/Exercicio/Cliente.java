package FundamentosJava.Section31Heranca.Exercicio;

import java.util.Date;

public class Cliente extends Pessoa {
    private static int contadorCliente;
    private int idCliente;
    private Date dataDeRegistro;
    private boolean vip;

    public Cliente(String nome, char genero, int idade, String direcao, Date dataDeRegistro, boolean vip) {
        super(nome, genero, idade, direcao);
        this.idCliente = ++contadorCliente;
        this.dataDeRegistro = dataDeRegistro;
        this.vip = vip;
    }

    public Cliente(Date dataDeRegistro, boolean vip) {
        super();
        this.idCliente = ++contadorCliente;
        this.dataDeRegistro = dataDeRegistro;
        this.vip = vip;
    }

    public Cliente(String nome, Date dataDeRegistro, boolean vip) {
        super(nome);
        this.idCliente = ++contadorCliente;
        this.dataDeRegistro = dataDeRegistro;
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(Date dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente{" +
                "idCliente=" + idCliente +
                ", dataDeRegistro=" + dataDeRegistro +
                ", vip=" + vip +
                '}';
    }
}
