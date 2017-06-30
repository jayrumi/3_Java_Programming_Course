package org.erumyantsev.figure.action;
import org.erumyantsev.figure.entity.Point;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class LengthEdgeCalculating {

    public Point edge(Point pointA, Point pointB){
        Point lengthEdge = new Point(pointB.getX()-pointA.getX(), pointB.getY()-pointA.getY(), pointB.getZ()-pointA.getZ());
        return lengthEdge;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
