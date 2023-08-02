package locations.secure;

import game.Player;
import locations.Location;

public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String locationName, int locationId) {
        super(player, locationName, locationId);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
