package org.erumyantsev.figure.action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.entity.Tetrahedron;
import org.erumyantsev.figure.observer.Observer;

/**
 * Created by Yauheni_Rumiantsau on 6/15/2017.
 */
public class TetrahedronCalculating implements Observer{

    private float surface;
    private float volume;
    private static final Logger LOG = LogManager.getLogger();

    public float triangleSquare(Point pointA, Point pointB, Point pointC){

        LengthEdgeCalculating coordinateEdge = new LengthEdgeCalculating();

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

        LOG.info("The surface area of tetrahedron is " + surface);
        return surface;
    }

    public float volumeTetrahedron(Tetrahedron tetrahedron){

        LengthEdgeCalculating coordinateEdge = new LengthEdgeCalculating();

        Point lengthEdgeAB = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointB());
        Point lengthEdgeAC = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointC());
        Point lengthEdgeAD = coordinateEdge.edge(tetrahedron.getPointA(), tetrahedron.getPointD());

        float volume =
                (lengthEdgeAB.getX()*lengthEdgeAC.getY()*lengthEdgeAD.getZ() +
                lengthEdgeAB.getY()*lengthEdgeAC.getX()*lengthEdgeAD.getZ() +
                lengthEdgeAB.getZ()*lengthEdgeAC.getX()*lengthEdgeAD.getY() -
                lengthEdgeAB.getZ()*lengthEdgeAC.getY()*lengthEdgeAD.getX() -
                lengthEdgeAB.getY()*lengthEdgeAC.getZ()*lengthEdgeAD.getX() -
                lengthEdgeAB.getX()*lengthEdgeAC.getZ()*lengthEdgeAD.getY())/6f;

        LOG.info("The volume of tetrahedron is " + volume);
        return volume;
    }

    public float getSurface() {
        return surface;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public void update(Tetrahedron tetrahedron) {
        this.surface = squareSurface(tetrahedron);
        this.volume = volumeTetrahedron(tetrahedron);
    }
}
