package by.erumyantsev.javacourse3.entity;

import java.util.List;
import java.util.Observer;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class Tetrahedron {

    //private static final Logger LOGGER = logManager.getLogger();

    //private List<Observer>

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Tetrahedron(Point pointA, Point pointB, Point pointC, Point pointD){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
}
