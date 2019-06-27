package calculate;

import java.awt.*;

class Path{

    private Point start;
    private Point end;
    private Point currentPosition;
    private float distanceToEnd;
    private int numberOfSpaces;

    Path(){
        this.start = null;
        this.end = null;
        this.currentPosition = null;
        this.distanceToEnd = 0f;
        this.numberOfSpaces = 0;
    }

    Path(Point start, Point end){
        this.start = start;
        this.end = end;
        this.currentPosition = start;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }
}
