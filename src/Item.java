public class Item extends Obj {
    public Item(String name, int level, int hp, int power, int money) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.power = power;
        this.money = money;
    }

    public void render() {
        System.out.println("===========================================");
        System.out.println("이름: " + this.getName());
        System.out.println("레벨: " + this.getLevel());
        System.out.println("체력: " + this.getHp());
        System.out.println("공격력: " + this.getPower());
        System.out.println("가격: " + this.getMoney());
        System.out.println("===========================================");
    }
}
