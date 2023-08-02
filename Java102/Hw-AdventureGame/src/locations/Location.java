package locations;


import game.Player;

public abstract class Location {
    private Player player;
    private String name;

    private int locationId;

    public Location(Player player, String name, int locationId) {
        this.player = player;
        this.name = name;
        this.locationId = locationId;
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocationId() {
        return locationId;
    }
}
