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

        float lengthEdgeAB = (float) Math.sqrt(Math.pow(edgeAB.getX(),2)+Math.pow(edgeAB.getY(),2)+Math.pow(edgeAB.getZ(),2));
        float lengthEdgeBC = (float) Math.sqrt(Math.pow(edgeBC.getX(),2)+Math.pow(edgeBC.getY(),2)+Math.pow(edgeBC.getZ(),2));
        float lengthEdgeAC = (float) Math.sqrt(Math.pow(edgeAC.getX(),2)+Math.pow(edgeAC.getY(),2)+Math.pow(edgeAC.getZ(),2));

        float perimetrABC = (lengthEdgeAB+lengthEdgeBC+lengthEdgeAC)/2;

        float squareABC = (float) Math.sqrt(perimetrABC*(perimetrABC-lengthEdgeAB)*(perimetrABC-lengthEdgeBC)*(perimetrABC-lengthEdgeAC));

        return squareABC;
    }

    public float squareSurface()
}
