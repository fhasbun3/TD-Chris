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

    private double width;
    private double height;

    private boolean canMove;

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

        this.spriteImageView = new ImageView(spriteImage); //make image viewable
        this.imageView.relocate(x,y); //relocates node into given x,y location
        this.imageView.setRotate(r);

        this.width = spriteImage.getWidth();
        this.height = spriteImage.getHeight();

        this.canMove = true;
    }

    public Image getSpriteImage() {
        return spreiteImage;
    }

    public ImageView getSpriteImageView () {
        return spriteImageView;
    }

    public Pane getLayer() {
        return layer;
    }

    public double getXComp() {
        return xcomp;
    }

    public double getYComp() {
        return ycomp;
    }

    public double getRComp() {
        return rcomp;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public double getDr() {
        return dr;
    }

    /*
    /This method adds the image of a sprite to the Pane (layer)
    */
    public void addToLayer() {
        this.layer.getChildren().add(this.spriteImageView);
    }

    public void move() {
        if(!canMove) {
            return;
        } else {
            x += dx;
            y += dy;
            r += dr;
        }
    }

}
