import java.util.Scanner;

public class HuntingField {
    private Player player;
    private Monster monster;

    public void setPlayer(Player _player) {
        player = _player;
    }

    public void hunt() {
        String input;

        while (true) {
            player.render();
            monster.render();

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 공격하기 2. 도망가기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 1:
                    player.setDamage(monster.getPower());
                    monster.setDamage(player.getPower());

                    if (player.getHp() <= 0) {
                        System.out.println("당신은 사망하셨습니다.");
                        player.reduceExp();
                        player.reduceMoney();
                        player.setHp(player.getMaxHp());
                        return;
                    }

                    if (monster.getHp() <= 0) {
                        System.out.println("사냥에 성공했습니다!");
                        player.plusExp(monster.getExp());
                        if (player.getExp() >= player.getMaxExp()) {
                            player.levelUp();
                            player.setHp(player.getMaxHp());
                        }
                        return;
                    }
                    break;
                case 2:
                    return;
            }
        }
    }

    public void update() {
        String input;

        while (true) {
            player.render();

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 초급 던전 2. 중급 던전 3. 고급 던전 4. 뒤로 가기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 1:
                    monster = new Monster();
                    monster.createMonster(numInput);
                    break;
                case 2:
                    monster = new Monster();
                    monster.createMonster(numInput);
                    break;
                case 3:
                    monster = new Monster();
                    monster.createMonster(numInput);
                    break;
                case 4:
                    return;
            }

            hunt();
        }
    }
}
