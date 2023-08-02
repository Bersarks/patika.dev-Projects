package monsters;

public class Vampire extends Monster{
    public Vampire() {
        setMonsterId(2);
        setDamage(4);
        setHealth(14);
        setMonsterName(getClass().getSimpleName());
        setPrizeMoney(7);
    }
}
