public class Enemy extends SpriteBase{
    private String name;
    private String damage;
    private String hp;

    public Enemy(String name, String damage, String hp) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getDamage() {
        return damage;
    }

    public String getHp() {
        return hp;
    }
}
