import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class DadoUno {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 600, 600);
        r.setColor(Color.BLACK);
        r.draw();

        Ellipse e = new Ellipse(250, 250, 100, 100);
        r.setColor(Color.BLACK);
        e.fill();
    }
}
