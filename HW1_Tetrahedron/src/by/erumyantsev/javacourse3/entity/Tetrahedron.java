package by.erumyantsev.javacourse3.entity;

import java.util.List;
import java.util.Observer;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class Tetrahedron implements Observable{

    //private static final Logger LOGGER = logManager.getLogger();

    private List<Observer> observersList;
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
        notifyObservers();
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
        notifyObservers();
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
        notifyObservers();
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer: observersList)
            observer.update(pointA, pointB, pointC, pointD);
    }
}
