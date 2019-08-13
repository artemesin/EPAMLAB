package logic;

import javafx.util.Pair;
import my.MyRectangle;


public class SplitFloorOnFourRectangles {

    public static MyRectangle leftTop = new MyRectangle(new Pair<>(0L, 15L), new Pair<>(15L, 30L));
    public static MyRectangle rightTop = new MyRectangle(new Pair<>(15L, 15L), new Pair<>(30L, 30L));
    public static MyRectangle rightDown = new MyRectangle(new Pair<>(15L, 0L), new Pair<>(30L, 15L));
    public static MyRectangle leftDown = new MyRectangle(new Pair<>(0L, 0L), new Pair<>(15L, 15L));

}
