package src.gameCharacters;

public abstract class GameCharacter {

    private int characterId;
    private String characterName;
    private int damage;
    private int health;
    private int cost;

    public GameCharacter(int characterId, String characterName, int damage, int health, int cost) {
        this.characterId = characterId;
        this.characterName = characterName;
        this.damage = damage;
        this.health = health;
        this.cost = cost;
    }

    public int getCharacterId() {
        return characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  "ID : " + characterId +
                ", Damage : " + damage +
                ", Health : " + health +
                ", Cost : " + cost +
                ", Name : " + characterName;
    }
}
