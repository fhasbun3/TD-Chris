import javafx.scene.layout.Pane;
import javafx.scene.pain.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class HealthBar extends Pane {

    private Rectangle outerRectangle;
    private Rectangle innerRectangle;
    private double height = 10;
    private double outerWidth = 60;
    private double innerWidth = 40;
    private double x = 0;
    private double y = 0;

    public HealthBar() {

        outerRectangle = new Rectangle(x, y, outerWidth, height);
        outerRectangle.setStroke(Color.BLACK);
        outerRectangle.setStrokeWidth(2);
        outerRectangle.setStrokeType(StrokeType.OUTSIDE);
        outerRectangle.setFill(Color.RED);

        innerRectangle = new Rectangle(x, y, innerWidth, height);
        innerRectangle.setStrokeType(StrokeType.OUTSIDE);
        innerRectangle.setFill(Color.LIMEGREEN);

        getChildren().addAll(outerRectangle, innerRectangle);
    }

    public void setValue(double value) {
        innerRectangle.setWidth(outerRectangle.getWidth() * value);
    }
}
