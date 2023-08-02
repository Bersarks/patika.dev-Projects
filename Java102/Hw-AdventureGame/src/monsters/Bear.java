package monsters;

public class Bear extends Monster{
    public Bear() {
        setMonsterId(3);
        setDamage(7);
        setHealth(20);
        setMonsterName(getClass().getSimpleName());
        setPrizeMoney(12);
    }
}
