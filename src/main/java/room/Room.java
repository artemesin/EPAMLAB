package room;

import javafx.util.Pair;

public class Room extends RoomInit {


    public Room(Pair<Long, Long> leftDownPoint, Pair<Long, Long> rightUpperPoint, long roomId) {
        super(leftDownPoint, rightUpperPoint, roomId);
    }
}
