package homepractice;

//week 8 HW Q.16
public class Point {
    int x;
    int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point second) {
        return distance(second.x, second.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) =" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }


}
