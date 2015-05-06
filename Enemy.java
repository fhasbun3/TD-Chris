import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Enemy extends SpriteBase{

    private HealthBar healthBar;

    public Enemy(Image spriteImage, Pane layer, double xcomp, double ycomp,
                      double rcomp, double dx, double dy, double dr, double hp,
                      double damage) {
        super(spriteImage, layer, xcomp, ycomp, rcomp, dx, dy, dr, hp, damage);
    }

    @Override
    public void checkRemovability() {

    }

    /**
    *This method is overriden because we want to add hp bars to the enemies
    */
    @Override
    public void addToLayer() {
        super.addToLayer();
        healthBar = new HealthBar();
        this.layer.getChildren().add(this.healthBar);
    }
}
