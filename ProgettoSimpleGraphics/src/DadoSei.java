import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class DadoSei {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 600, 600);
        r.setColor(Color.BLACK);
        r.draw();

        Ellipse b1 = new Ellipse(25, 480, 100, 100);
        b1.setColor(Color.BLACK);
        b1.fill();

        Ellipse v2 = new Ellipse(480, 480, 100, 100);
        v2.setColor(Color.BLACK);
        v2.fill();

        Ellipse c3 = new Ellipse(480, 20, 100, 100);
        c3.setColor(Color.BLACK);
        c3.fill();

        Ellipse l4 = new Ellipse(25, 20, 100, 100);
        l4.setColor(Color.BLACK);
        l4.fill();

        Ellipse w5 = new Ellipse(25, 240, 100, 100);
        w5.setColor(Color.BLACK);
        w5.fill();

        Ellipse M6 = new Ellipse(480, 240, 100, 100);
        M6.setColor(Color.BLACK);
        M6.fill();
    }
}
