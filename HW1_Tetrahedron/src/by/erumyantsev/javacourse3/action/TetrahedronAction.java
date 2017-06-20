package by.erumyantsev.javacourse3.action;
import by.erumyantsev.javacourse3.entity.Point;
import by.erumyantsev.javacourse3.entity.Tetrahedron;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class TetrahedronAction implements Observer{

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

    public float squareSurface(Tetrahedron tetrahedron){
        float surface =
                triangleSquare(tetrahedron.getPointA(), tetrahedron.getPointB(), tetrahedron.getPointC()) +
                triangleSquare(tetrahedron.getPointA(), tetrahedron.getPointC(), tetrahedron.getPointD()) +
                triangleSquare(tetrahedron.getPointA(), tetrahedron.getPointB(), tetrahedron.getPointD()) +
                triangleSquare(tetrahedron.getPointD(), tetrahedron.getPointB(), tetrahedron.getPointC());

        return surface;
    }

    public float volumeTetrahedron(Tetrahedron tetrahedron){

        PointAction coordinateEdge = new PointAction();

        Point lengthEdgeAB = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointB());
        Point lengthEdgeAC = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointC());
        Point lengthEdgeAD = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointD());

        float volume =
                (lengthEdgeAB.getX()*lengthEdgeAC.getY()*lengthEdgeAD.getZ() +
                lengthEdgeAB.getY()*lengthEdgeAC.getX()*lengthEdgeAD.getZ() +
                lengthEdgeAB.getZ()*lengthEdgeAC.getX()*lengthEdgeAD.getY() -
                lengthEdgeAB.getZ()*lengthEdgeAC.getY()*lengthEdgeAD.getX() -
                lengthEdgeAB.getY()*lengthEdgeAC.getZ()*lengthEdgeAD.getX() -
                lengthEdgeAB.getX()*lengthEdgeAC.getZ()*lengthEdgeAD.getY())/6;

        return volume;
    }
}
