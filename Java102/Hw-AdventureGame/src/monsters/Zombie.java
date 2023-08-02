package monsters;

public class Zombie extends Monster{
    public Zombie() {
        setMonsterId(1);
        setDamage(3);
        setHealth(10);
        setMonsterName(getClass().getSimpleName());
        setPrizeMoney(4);
    }
}
