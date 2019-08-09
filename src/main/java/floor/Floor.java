package floor;

import room.Room;

import java.util.List;

public class Floor extends FloorInit {

    public Floor(long floorId, List<Room> roomsOnTheFloor) {
        super(floorId, roomsOnTheFloor);
    }
}
