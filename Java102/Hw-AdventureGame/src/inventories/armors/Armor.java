package src.inventories.armors;

public class Armor {
    public enum armorTypes {LIGHT, MEDIUM, HEAVY}

    private final int id;
    private final int attackBlocking;
    private final int cost;
    private final armorTypes type;

    public Armor(int id, int attackBlocking, int cost, armorTypes type) {
        this.id = id;
        this.attackBlocking = attackBlocking;
        this.cost = cost;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                ", Attack Blocking : " + attackBlocking +
                ", Cost : " + cost +
                ", Type : " + type.name();
    }

    public int getAttackBlocking() {
        return attackBlocking;
    }

    public int getCost() {
        return cost;
    }

    public String getArmorName(){
        return type.name();
    }
}
