package test.action;
import by.erumyantsev.javacourse3.action.PointAction;
import by.erumyantsev.javacourse3.entity.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yauheni_Rumiantsau on 6/18/2017.
 */
public class PointActionTest {

    @Test
    public void edgeCompare(){

        Point pointA = new Point(-1, 0, 1);
        Point pointB = new Point(7, 8, 9);
        Point expected = new Point(8, 8, 8);

        PointAction edgeAB = new PointAction();
        Point actual = edgeAB.edge(pointA, pointB);
        Assert.assertEquals(expected, actual);

    }
}
