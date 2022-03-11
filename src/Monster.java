public class Monster extends Obj {
    public void render() {
        System.out.println("===========================================");
        System.out.println("이름: " + this.getName());
        System.out.println("체력/최대 체력: " + this.getHp() + "/" + this.getMaxHp());
        System.out.println("공격력: " + this.getPower());
        System.out.println("===========================================");
    }

    public void createMonster(int input) {
        switch (input) {
            case 1:
                this.setName("곰");
                this.setMaxHp(30);
                this.setHp(this.getMaxHp());
                this.setPower(10);
                break;
            case 2:
                this.setName("고블린");
                this.setMaxHp(50);
                this.setHp(this.getMaxHp());
                this.setPower(30);
                break;
            case 3:
                this.setName("악마");
                this.setMaxHp(70);
                this.setHp(this.getMaxHp());
                this.setPower(50);
                break;
            default:
                break;
        }
    }
}
