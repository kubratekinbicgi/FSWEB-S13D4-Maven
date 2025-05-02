package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){ // 0'a olan uzaklık (x- 0) karesi + (y - 0) karesi sonuç = x2 + y2
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(Point point){
        if(point == null){
            System.out.println("Point objesi null geldi");
            return 0;
        }
         return  distance(point.x, point.y);
           // return  Math.sqrt(Math.pow((x - point.x) ,2) + Math.pow((y - point.y), 2)); // Point x ile bizim x ve point y ile bizim verdiğimiz y arasıındaki uzaklık
    }

    public double distance(int x, int y){
        return  Math.sqrt(Math.pow((this.x - x) ,2) + Math.pow((this.y - y), 2));
    }

}
