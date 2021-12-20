import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Point;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S03TravelingCircle extends GraphicsApp {

    private static final Point TOP_LEFT_CORNER = new Point (30, 30);
    private static final Point TOP_RIGHT_CORNER = new Point (470, 30);
    private static final Point BOTTOM_RIGHT_CORNER = new Point (470, 470);
    private static final Point BOTTOM_LEFT_CORNER = new Point (30, 470);

    private Circle circle;
    private int xVelocity = 1;
    private int yVelocity = 0;
   
    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circle = new Circle(TOP_LEFT_CORNER.getXPos(), TOP_LEFT_CORNER.getYPos(), 20, Colors.RED);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        if(circle.getXPos() == TOP_LEFT_CORNER.getXPos() && circle.getYPos() == TOP_LEFT_CORNER.getYPos()) {
            xVelocity = 1;
            yVelocity = 0;
        }
        if(circle.getXPos() == TOP_RIGHT_CORNER.getXPos() && circle.getYPos() == TOP_RIGHT_CORNER.getYPos()) {
            xVelocity = 0;
            yVelocity = 1;
        }
        if(circle.getXPos() == BOTTOM_RIGHT_CORNER.getXPos() && circle.getYPos() == BOTTOM_RIGHT_CORNER.getYPos()) {
            xVelocity = -1;
            yVelocity = 0;
        }
        if(circle.getXPos() == BOTTOM_LEFT_CORNER.getXPos() && circle.getYPos() == BOTTOM_LEFT_CORNER.getYPos()) {
            xVelocity = 0;
            yVelocity = -1;
        }
        circle.move(xVelocity, yVelocity);
        circle.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S03TravelingCircle");
    }
}
