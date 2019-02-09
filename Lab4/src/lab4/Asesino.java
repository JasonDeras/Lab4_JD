package lab4;

public class Asesino extends Agentes {

    private String nombreAsesino;
    private String arma;

    public Asesino() {
        super();
    }

    public Asesino(String nombreAsesino, String arma) {
        this.nombreAsesino = nombreAsesino;
        this.arma = arma;
    }

    public String getNombreAsesino() {
        return nombreAsesino;
    }

    public void setNombreAsesino(String nombreAsesino) {
        this.nombreAsesino = nombreAsesino;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString() + "nombreAsesino=" + nombreAsesino + ", arma=" + arma + '}';
    }

    @Override
    public void cometerDelito() {
        System.out.println("Asesino " + nombreAsesino + " utilizó el arma " + arma); //To change body of generated methods, choose Tools | Templates.
    }

}
