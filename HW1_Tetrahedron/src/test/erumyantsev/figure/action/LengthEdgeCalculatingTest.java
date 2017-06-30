package test.erumyantsev.figure.action;
import org.erumyantsev.figure.action.LengthEdgeCalculating;
import org.erumyantsev.figure.entity.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yauheni_Rumiantsau on 6/18/2017.
 */
public class LengthEdgeCalculatingTest {

    @Test
    public void edgeCompare(){

        Point pointA = new Point(-1, 0, 1);
        Point pointB = new Point(7, 8, 9);
        Point expected = new Point(8, 8, 8);

        LengthEdgeCalculating edgeAB = new LengthEdgeCalculating();
        Point actual = edgeAB.edge(pointA, pointB);
        Assert.assertEquals(expected, actual);

    }
}
