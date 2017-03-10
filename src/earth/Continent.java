package earth;

/**
 * Created by Taras on 10.03.2017.
 */
public enum Continent {

    AFRICA(Direction.WEST, 57.54, 47.47), EURASIA(Direction.EAST, 17.22, 51.00), NORTH_AMERICA(Direction.NORTH, 22.34, 81.10),
    SOUTH_AMERICA(Direction.SOUTH, 57.54, 47.47), ANTARCTICA(Direction.SOUTH, 27.51, 50.14), AUSTRALIA(Direction.EAST, 21.14, 76.34);

    Direction direction;
    double latitude;
    double longitude;

    Continent(Direction direction, double latitude, double longitude) {
        this.direction = direction;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
