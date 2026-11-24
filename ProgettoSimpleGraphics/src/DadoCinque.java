import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class DadoCinque {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 600, 600);
        r.setColor(Color.BLACK);
        r.draw();

        Ellipse b = new Ellipse(25, 480, 100, 100);
        b.setColor(Color.BLACK);
        b.fill();

        Ellipse v = new Ellipse(480, 480, 100, 100);
        v.setColor(Color.BLACK);
        v.fill();

        Ellipse c = new Ellipse(480, 20, 100, 100);
        c.setColor(Color.BLACK);
        c.fill();

        Ellipse l = new Ellipse(25, 20, 100, 100);
        l.setColor(Color.BLACK);
        l.fill();

        Ellipse w = new Ellipse(250, 250, 100, 100);
        w.setColor(Color.BLACK);
        w.fill();
    }
}
