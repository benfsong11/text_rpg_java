import java.util.Scanner;

public class GameStage {
    private Player player;
    private HuntingField huntingField;
    private Store store;
    private Inventory inventory;

    public GameStage() {
        player = new Player();
        if (player != null) {
            player.selectJob();
        }
    }

    public void update() {
        String input;

        while (true) {
            player.render();

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 사냥터 2. 상점 3. 인벤토리 4. 종료하기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 1:
                    if (huntingField == null) {
                        huntingField = new HuntingField();
                        huntingField.setPlayer(player);
                    }
                    huntingField.update();
                    break;
                case 2:
                    if (store == null) {
                        store = new Store();
                        store.setPlayer(player);
                        if (inventory == null) {
                            inventory = new Inventory();
                            store.setInventory(inventory);
                        }
                    }
                    store.update();
                    break;
                case 3:
                    if (inventory == null) {
                        inventory = new Inventory();
                        inventory.setPlayer(player);
                    } else {
                        inventory.setPlayer(player);
                    }
                    inventory.update();
                    break;
                case 4:
                    return;
            }
        }
    }
}
