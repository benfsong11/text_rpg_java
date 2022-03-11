import java.util.Scanner;

public class Player extends Obj {
    public void render() {
        System.out.println("===========================================");
        System.out.println("직업: " + this.getName());
        System.out.println("체력/최대 체력: " + this.getHp() + "/" + this.getMaxHp());
        System.out.println("공격력: " + this.getPower());
        System.out.println("===========================================");
    }

    public void selectJob() {
        String input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("텍스트 알피지에 오신 것을 환영합니다!");
        System.out.println("직업을 선택하고 몬스터를 처치해 주세요!");
        System.out.println("===========================================");
        System.out.print("1. 전사 2. 마법사 3. 궁수 4. 종료하기 > ");
        input = scanner.nextLine();
        int numInput = Integer.parseInt(input);

        switch (numInput) {
            case 1:
                this.setName("전사");
                this.setMaxHp(100);
                this.setHp(this.getMaxHp());
                this.setPower(20);
                break;
            case 2:
                this.setName("마법사");
                this.setMaxHp(45);
                this.setHp(this.getMaxHp());
                this.setPower(40);
                break;
            case 3:
                this.setName("궁수");
                this.setMaxHp(60);
                this.setHp(this.getMaxHp());
                this.setPower(30);
                break;
            case 4:
                return;
        }

    }
}
