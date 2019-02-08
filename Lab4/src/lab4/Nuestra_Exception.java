package lab4;

import java.awt.Color;

public class Nuestra_Exception extends Exception {

    private Color color;

    public Nuestra_Exception() {
        super();
    }

    public Nuestra_Exception(Color color, String string) {
        super(string);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mi_Exception{" + "color=" + color + '}';
    }

}
