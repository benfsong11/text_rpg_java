public class Monster extends Obj {
    public void render() {
        System.out.println("===========================================");
        System.out.println("이름: " + this.getName());
        System.out.println("레벨: " + this.getLevel());
        System.out.println("체력/최대 체력: " + this.getHp() + "/" + this.getMaxHp());
        System.out.println("공격력: " + this.getPower());
        System.out.println("처치 시 획득 경험치: " + this.getExp());
        System.out.println("처치 시 획득 금액: " + this.getMoney());
        System.out.println("===========================================");
    }

    public void createMonster(int input) {
        switch (input) {
            case 1:
                this.setName("곰");
                this.setMaxHp(30);
                this.setHp(this.getMaxHp());
                this.setPower(10);
                this.setExp(15);
                this.setMoney(30);
                break;
            case 2:
                this.setName("고블린");
                this.setMaxHp(50);
                this.setHp(this.getMaxHp());
                this.setPower(30);
                this.setExp(25);
                this.setMoney(50);
                this.setLevel(2);
                break;
            case 3:
                this.setName("악마");
                this.setMaxHp(70);
                this.setHp(this.getMaxHp());
                this.setPower(50);
                this.setExp(35);
                this.setMoney(70);
                this.setLevel(3);
                break;
            default:
                break;
        }
    }
}
