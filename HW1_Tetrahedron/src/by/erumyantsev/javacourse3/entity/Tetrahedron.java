package by.erumyantsev.javacourse3.entity;

import by.erumyantsev.javacourse3.observer.Observable;
import by.erumyantsev.javacourse3.observer.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class Tetrahedron implements Observable {

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
        //observersList = new LinkedList<>();

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
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer: observersList)
            observer.update(this);
    }
}
