package room;

import javafx.util.Pair;

public class RoomInit {
    private Pair<Long, Long> leftDownPoint;
    private Pair<Long, Long> rightUpperPoint;
    private long roomId;

    public RoomInit(Pair<Long, Long> leftDownPoint, Pair<Long, Long> rightUpperPoint, long roomId) {
        this.leftDownPoint = leftDownPoint;
        this.rightUpperPoint = rightUpperPoint;
        this.roomId = roomId;
    }

    public Pair<Long, Long> getLeftDownPoint() {
        return leftDownPoint;
    }

    public void setLeftDownPoint(Pair<Long, Long> leftDownPoint) {
        this.leftDownPoint = leftDownPoint;
    }

    public Pair<Long, Long> getRightUpperPoint() {
        return rightUpperPoint;
    }

    public void setRightUpperPoint(Pair<Long, Long> rightUpperPoint) {
        this.rightUpperPoint = rightUpperPoint;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
}
