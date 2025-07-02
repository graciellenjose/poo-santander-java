package exercicios.carro;

public class Carro {
    private boolean ligaDesliga;
    private int velocidade;
    private String sentido;
    private int marcha;

    public boolean isLigaDesliga() {
        return ligaDesliga;
    }

    public void setLigaDesliga(boolean ligaDesliga) {
        this.ligaDesliga = ligaDesliga;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
