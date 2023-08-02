package monsters;

public class Snake extends Monster{
    public Snake() {
        setMonsterId(4);
        setDamage((int)(Math.random() * 4) + 3);
        setHealth(12);
        setMonsterName(getClass().getSimpleName());
        setPrizeMoney(0);
    }

}
