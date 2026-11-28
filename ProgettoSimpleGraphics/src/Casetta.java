import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Casetta {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(0, 0, 600, 600);
        r.setColor(Color.BLACK);
        r.draw();

        // Sole
        Ellipse e1 = new Ellipse(490, 30, 75, 75);
        e1.setColor(Color.YELLOW);
        e1.fill();

        // Casa
        Rectangle f2 = new Rectangle(200, 267, 200, 200);
        f2.setColor(Color.ORANGE);
        f2.fill();

        // Finestra sinistra
        Rectangle d3  = new Rectangle(220, 310,  45, 45);
        d3.setColor(Color.BLUE);
        d3.fill();

        }
}
