package my;

import javafx.util.Pair;

public class MyRectangle {
    private Pair<Long, Long> leftDownEdge;
    private Pair<Long, Long> upperHigherEdge;

    public MyRectangle(Pair<Long, Long> leftDownEdge, Pair<Long, Long> upperHigherEdge) {
        this.leftDownEdge = leftDownEdge;
        this.upperHigherEdge = upperHigherEdge;
    }

    public Pair<Long, Long> getLeftDownEdge() {
        return leftDownEdge;
    }

    public void setLeftDownEdge(Pair<Long, Long> leftDownEdge) {
        this.leftDownEdge = leftDownEdge;
    }

    public Pair<Long, Long> getUpperHigherEdge() {
        return upperHigherEdge;
    }

    public void setUpperHigherEdge(Pair<Long, Long> upperHigherEdge) {
        this.upperHigherEdge = upperHigherEdge;
    }
}
