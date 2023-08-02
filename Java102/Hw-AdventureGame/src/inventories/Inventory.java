package src.inventories;

import inventories.weapons.Weapon;
import src.game.Player;
import src.inventories.armors.Armor;

public class Inventory {

    Player player;
    private boolean waterState, foodState, firewoodState;
    private Weapon weapon;
    private Armor armor;

    public Inventory(Player player){
        this.player = player;
    }



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        player.setPlayerDamage(player.getPlayerCharacter().getDamage() + weapon.getWeaponDamage());
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
        player.setPlayerArmorBlocking(armor.getAttackBlocking());
    }

    public boolean getWaterState() {
        return waterState;
    }

    public void setWaterState(boolean waterState) {
        this.waterState = waterState;
    }

    public boolean getFoodState() {
        return foodState;
    }

    public void setFoodState(boolean foodState) {
        this.foodState = foodState;
    }

    public boolean getFirewoodState() {
        return firewoodState;
    }

    public void setFirewoodState(boolean firewoodState) {
        this.firewoodState = firewoodState;
    }
}
