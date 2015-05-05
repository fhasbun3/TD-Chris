import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class SpriteBase {

    private Image spriteImage;
    private ImageView spriteImageView;
    private Pane layer;

    private double xcomp;
    private double ycomp;
    private double rcomp;

    private double dx;
    private double dy;
    private double dr;

    private double hp;
    private double damage;

    public SpriteBase(Image spriteImage, Pane layer, double xcomp, double ycomp,
                      double rcomp, double dx, double dy, double dr, double hp,
                      double damage) {
        this.spriteImage = spriteImage;
        this.layer = layer;
        this.xcomp = xcomp;
        this.ycomp = ycomp;
        this.rcomp = rcomp;
        this.dx = dx;
        this.dy = dy;
        this.dr = dr;
        this.hp = hp;
        this.damage = damage;                     
    }
}
