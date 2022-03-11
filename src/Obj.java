abstract public class Obj {
    private String name;
    private int hp;
    private int maxHp;
    private int power;

    public Obj() {
        name = "";
        hp = 0;
        maxHp = 0;
        power = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDamage(int power) {
        this.hp -= power;
    }

    abstract void render();
}
