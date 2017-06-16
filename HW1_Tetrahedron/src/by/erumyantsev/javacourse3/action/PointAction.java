package by.erumyantsev.javacourse3.action;
import by.erumyantsev.javacourse3.entity.Point;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class PointAction {

    public Point edge(Point pointA, Point pointB){
        Point lengthEdge = new Point(pointB.getX()-pointA.getX(), pointB.getY()-pointA.getY(), pointB.getZ()-pointA.getZ());
        return lengthEdge;
    }

}
