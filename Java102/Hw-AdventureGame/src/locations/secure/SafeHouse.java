package locations.secure;

import game.Player;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "SAFE HOUSE", 1);
    }

    @Override
    public boolean onLocation() {

        getPlayer().setSafeHouseState(true);
        getPlayer().recovery();
        return true;
    }
}
