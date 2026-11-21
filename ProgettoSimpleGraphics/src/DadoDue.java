import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class DadoDue {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 600, 600);
        r.setColor(Color.BLACK);
        r.draw();

        Ellipse e = new Ellipse(250, 250, 100, 100);
        e.setColor(Color.BLACK);
        e.fill();

        Ellipse b = new Ellipse(500, 500, 100, 100);
        b.setColor(Color.BLACK);
        b.fill();


    }
}
