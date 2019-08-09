package floor;

import room.Room;

import java.util.List;

public class FloorInit {
    private long floorId;
    private List<Room> roomsOnTheFloor;

    public FloorInit(long floorId, List<Room> roomsOnTheFloor) {
        this.floorId = floorId;
        this.roomsOnTheFloor = roomsOnTheFloor;
    }

    public long getFloorId() {
        return floorId;
    }

    public List<Room> getRoomsOnTheFloor() {
        return roomsOnTheFloor;
    }

    public void setFloorId(long floorId) {
        this.floorId = floorId;
    }

    public void setRoomsOnTheFloor(List<Room> roomsOnTheFloor) {
        this.roomsOnTheFloor = roomsOnTheFloor;
    }
}
