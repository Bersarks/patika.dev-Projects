package inventories.weapons;

public abstract class Weapon {

    private final int weaponId;
    private final int weaponDamage;
    private final int weaponCost;
    private final String weaponName;

    public Weapon(int weaponId, int weaponDamage, int weaponCost, String weaponName) {
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponCost = weaponCost;
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "ID :" + weaponId +
                ", Damage : " + weaponDamage +
                ", Cost : " + weaponCost +
                ", Name : " + weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getWeaponCost() {
        return weaponCost;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
