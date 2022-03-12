import java.util.Scanner;

public class Store {
    private Player player;
    private Inventory inventory;
    private Item[] weapon;
    private Item[] armor;

    public Store() {
        weapon = new Item[3];
        armor = new Item[3];
    }

    public void setPlayer(Player _player) {
        player = _player;
    }

    public void setInventory(Inventory _inventory) {
        inventory = _inventory;
    }

    public void setWeapon() {
        weapon[0] = new Item("파프니르 무기", 1, 0, 20, 200);
        weapon[1] = new Item("앱솔랩스 무기", 2, 0, 50, 500);
        weapon[2] = new Item("아케인셰이드 무기", 3, 0, 100, 1000);
    }

    public void setArmor() {
        armor[0] = new Item("이글아이 갑옷", 1, 100, 0, 200);
        armor[1] = new Item("앱솔랩스 갑옷", 2, 500, 0, 500);
        armor[2] = new Item("아케인셰이드 갑옷", 3, 1000, 0, 1000);
    }

    public void buyItem(int _input) {
        String input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("#. 구매할 아이템의 번호 0. 뒤로 가기 > ");
        input = scanner.nextLine();
        int numInput = Integer.parseInt(input);

        switch (_input) {
            case 1:
                if (numInput <= 0 || numInput > 3) {
                    return;
                } else {
                    inventory.setItemList(weapon[numInput - 1]);
                }
                break;
            case 2:
                if (numInput <= 0 || numInput > 3) {
                    return;
                } else {
                    inventory.setItemList(armor[numInput - 1]);
                }
                break;
        }
    }


    public void update() {
        String input;

        while (true) {
            player.render();

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 무기 코너 2. 방어구 코너 3. 판매하기 4. 뒤로 가기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 1:
                    setWeapon();
                    for (int i = 0; i < weapon.length; i++) {
                        weapon[i].render();
                    }
                    buyItem(numInput);
                    break;
                case 2:
                    setArmor();
                    for (int i = 0; i < armor.length; i++) {
                        armor[i].render();
                    }
                    buyItem(numInput);
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
}