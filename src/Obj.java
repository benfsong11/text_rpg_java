abstract public class Obj {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int power;
    protected int money;
    protected int level;
    protected int exp;
    protected int maxExp;
    protected int additionalHp;
    protected int additionalPower;
    protected String weaponName;
    protected String armorName;

    public Obj() {
        name = "";
        hp = 0;
        maxHp = 0;
        power = 0;
        money = 0;
        level = 1;
        exp = 0;
        maxExp = 100;
        additionalHp = 0;
        additionalPower = 0;
        weaponName = "";
        armorName = "";
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getAdditionalHp() {
        return additionalHp;
    }

    public void setAdditionalHp(int additionalHp) {
        this.additionalHp = additionalHp;
    }

    public int getAdditionalPower() {
        return additionalPower;
    }

    public void setAdditionalPower(int additionalPower) {
        this.additionalPower = additionalPower;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
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
