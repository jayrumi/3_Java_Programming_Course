package by.erumyantsev.javacourse3.action;
import by.erumyantsev.javacourse3.entity.Point;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class TetrahedronAction {

    public float triangleSquare(Point pointA, Point pointB, Point pointC){

        PointAction coordinateEdge = new PointAction();

        Point edgeAB = coordinateEdge.edge(pointA, pointB);
        Point edgeBC = coordinateEdge.edge(pointB, pointC);
        Point edgeAC = coordinateEdge.edge(pointA, pointC);

gi

    }
}
