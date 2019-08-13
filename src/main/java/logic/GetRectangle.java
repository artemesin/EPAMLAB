package logic;

import javafx.util.Pair;
import room.Room;

import java.util.List;

public class GetRectangle {
    private List<Integer> firstSector;
    private List<Integer> secondSector;
    private List<Integer> thirdSector;
    private List<Integer> fourthSector;

    public GetRectangle(List<Integer> firstSector, List<Integer> secondSector, List<Integer> thirdSector, List<Integer> fourthSector) {
        this.firstSector = firstSector;
        this.secondSector = secondSector;
        this.thirdSector = thirdSector;
        this.fourthSector = fourthSector;
    }

    public List<Integer> getFirstSector() {
        return firstSector;
    }

    public void setFirstSector(List<Integer> firstSector) {
        this.firstSector = firstSector;
    }

    public List<Integer> getSecondSector() {
        return secondSector;
    }

    public void setSecondSector(List<Integer> secondSector) {
        this.secondSector = secondSector;
    }

    public List<Integer> getThirdSector() {
        return thirdSector;
    }

    public void setThirdSector(List<Integer> thirdSector) {
        this.thirdSector = thirdSector;
    }

    public List<Integer> getFourthSector() {
        return fourthSector;
    }

    public void setFourthSector(List<Integer> fourthSector) {
        this.fourthSector = fourthSector;
    }


    //Searching for human location (In which rectangle he is) (left upper - first, right upper - second, left down - third, left bottom - fourth)
    public static int getRectangle(long tempHumanPositionX, long tempHumanPositionY) {

        if ((tempHumanPositionX < 15 && tempHumanPositionY < 30) && (tempHumanPositionX > 0 && tempHumanPositionY > 15)) {
            return 1;
        }

        if ((tempHumanPositionX > 15 && tempHumanPositionY > 15) && (tempHumanPositionX < 30 && tempHumanPositionY < 30)) {
            return 2;
        }

        if ((tempHumanPositionX > 0 && tempHumanPositionY > 0) && (tempHumanPositionX < 15 && tempHumanPositionY < 15)) {
            return 3;
        }

        if ((tempHumanPositionX > 15 && tempHumanPositionY > 0) && (tempHumanPositionX < 30 && tempHumanPositionY < 15)) {
            return 4;
        }
        return 0;
    }

    public static void splitRoomsForRectangles(List<Room> floor) {
        for (Room room : floor) {
            Pair<Long, Long> tempCoordinatePair = destBetweenTwoPoints(room.getLeftDownPoint().getKey(), room.getLeftDownPoint().getValue(), room.getRightUpperPoint().getKey(), room.getRightUpperPoint().getValue());
            getRectangle(tempCoordinatePair.getKey(), tempCoordinatePair.getValue());

        }
    }


    //Searching for the middle point of room
    public static Pair<Long, Long> destBetweenTwoPoints(long x1, long y1, long x2, long y2) {
        return new Pair<>((Math.abs(x1 - x2) / 2), (Math.abs(y1 - y2) / 2));
    }
}
