import java.util.*;

public class Inventory {
    private Player player;
    private List<Item> itemList;

    public Inventory() {
        itemList = new ArrayList<Item>();
    }

    public void setPlayer(Player _player) {
        player = _player;
    }

    public void setItemList(Item item) {
        itemList.add(item);
    }

    public void equipItem() {

        String input;

        while (true) {
            player.render();
            for (int i = 0; i < itemList.size(); i++) {
                System.out.println(i + 1 + "번 아이템");
                itemList.get(i).render();
            }
            if (itemList.isEmpty()) {
                System.out.println("===========================================");
                System.out.println("아이템이 없습니다.");
                System.out.println("===========================================");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("#. 장착할 아이템의 번호 0. 뒤로 가기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 0:
                    return;
                case 1:
                    if (itemList.get(numInput - 1).getHp() == 0) {
                        player.setWeaponName(itemList.get(numInput - 1).getName());
                        player.setAdditionalPower(itemList.get(numInput - 1).getPower());
                        player.plusPower(itemList.get(numInput - 1).getPower());
                    } else if (itemList.get(numInput - 1).getPower() == 0) {
                        player.setArmorName(itemList.get(numInput - 1).getName());
                        player.setAdditionalHp(itemList.get(numInput - 1).getHp());
                        player.plusHp(itemList.get(numInput - 1).getHp());
                    }
                    break;
                case 2:
                    if (itemList.get(numInput - 1).getHp() == 0) {
                        player.setWeaponName(itemList.get(numInput - 1).getName());
                        player.setAdditionalPower(itemList.get(numInput - 1).getPower());
                        player.plusPower(itemList.get(numInput - 1).getPower());
                    } else if (itemList.get(numInput - 1).getPower() == 0) {
                        player.setArmorName(itemList.get(numInput - 1).getName());
                        player.setAdditionalHp(itemList.get(numInput - 1).getHp());
                        player.plusHp(itemList.get(numInput - 1).getHp());
                    }
                    break;
                case 3:
                    if (itemList.get(numInput - 1).getHp() == 0) {
                        player.setWeaponName(itemList.get(numInput - 1).getName());
                        player.setAdditionalPower(itemList.get(numInput - 1).getPower());
                        player.plusPower(itemList.get(numInput - 1).getPower());
                    } else if (itemList.get(numInput - 1).getPower() == 0) {
                        player.setArmorName(itemList.get(numInput - 1).getName());
                        player.setAdditionalHp(itemList.get(numInput - 1).getHp());
                        player.plusHp(itemList.get(numInput - 1).getHp());
                    }
                    break;
                case 4:
                    if (itemList.get(numInput - 1).getHp() == 0) {
                        player.setWeaponName(itemList.get(numInput - 1).getName());
                        player.setAdditionalPower(itemList.get(numInput - 1).getPower());
                        player.plusPower(itemList.get(numInput - 1).getPower());
                    } else if (itemList.get(numInput - 1).getPower() == 0) {
                        player.setArmorName(itemList.get(numInput - 1).getName());
                        player.setAdditionalHp(itemList.get(numInput - 1).getHp());
                        player.plusHp(itemList.get(numInput - 1).getHp());
                    }
                    break;
                case 5:
                    if (itemList.get(numInput - 1).getHp() == 0) {
                        player.setWeaponName(itemList.get(numInput - 1).getName());
                        player.setAdditionalPower(itemList.get(numInput - 1).getPower());
                        player.plusPower(itemList.get(numInput - 1).getPower());
                    } else if (itemList.get(numInput - 1).getPower() == 0) {
                        player.setArmorName(itemList.get(numInput - 1).getName());
                        player.setAdditionalHp(itemList.get(numInput - 1).getHp());
                        player.plusHp(itemList.get(numInput - 1).getHp());
                    }
                    break;
            }
        }
    }

    public void releaseItem() {
        String input;

        while (true) {
            player.render();

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 무기 해제 2. 방어구 해제 0. 뒤로 가기 > ");
            input = scanner.nextLine();
            int numInput = Integer.parseInt(input);

            switch (numInput) {
                case 1:
                    if (player.getWeaponName().isEmpty()) {
                        System.out.println("해제할 무기가 없습니다.");
                    } else {
                        player.setWeaponName("");
                        player.minusPower(player.getAdditionalPower());
                        player.setAdditionalPower(0);
                    }
                    break;
                case 2:
                    if (player.getArmorName().isEmpty()) {
                        System.out.println("해제할 방어구가 없습니다.");
                    } else {
                        player.setArmorName("");
                        player.minusHp(player.getAdditionalHp());
                        player.setAdditionalHp(0);
                    }
                    break;
            }

        }
    }

    public void update() {
        String input;

        player.render();

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 장착하기 2. 해제하기 3. 뒤로 가기 > ");
        input = scanner.nextLine();
        int numInput = Integer.parseInt(input);

        switch (numInput) {
            case 1:
                equipItem();
                break;
            case 2:
                releaseItem();
                break;
            case 3:
                return;
        }


    }
}
