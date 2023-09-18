package exercise;

// BEGIN
class Segment{
    private Point beginPoint;
    private Point endPoint;
    private Point midPoint;

    public Segment(Point beginPoint, Point endPoint){
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
        this.midPoint = new Point((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getMidPoint() {
        return midPoint;
    }

    public void setMidPoint(Point midPoint) {

        this.midPoint = midPoint;
    }
}
// END
