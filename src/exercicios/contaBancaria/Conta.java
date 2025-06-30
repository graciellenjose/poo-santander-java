package exercicios.contaBancaria;

public class Conta {
    private float saldo;
    private float chequeEspecial;
    private boolean boleto = false;
    private float saque;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial(){
        if(saldo <= 500){
            chequeEspecial = 50;
        } else {
            chequeEspecial = 0.50f * saldo;
        }

        return chequeEspecial;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public boolean isBoleto() {
        return boleto;
    }

    public void setBoleto(boolean boleto) {
        this.boleto = boleto;
    }
}
