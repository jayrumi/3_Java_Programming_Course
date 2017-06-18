package test.action;

import by.erumyantsev.javacourse3.action.TetrahedronAction;
import by.erumyantsev.javacourse3.entity.Point;
import by.erumyantsev.javacourse3.entity.Tetrahedron;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yauheni_Rumiantsau on 6/18/2017.
 */
public class TetrahedronActionTest {

    @Test
    public void tetrahedronVolumeCheck(){

        float expectedVolume = (float) 859.539449;

        Point pointA = new Point((float) 5.02, (float) 10.13, (float) 5.08);
        Point pointB = new Point((float) 0.04, (float) 0.09, (float) 0.01);
        Point pointC = new Point((float) 12.11, (float) 0.07, (float) 0.06);
        Point pointD = new Point((float) 1.16, (float) 1.02, (float) 7.57);

        Tetrahedron tetrahedronActual = new Tetrahedron(pointA, pointB, pointC, pointD);
        TetrahedronAction actualVolume = new TetrahedronAction();

        Assert.assertEquals(expectedVolume, actualVolume.volumeTetrahedron(tetrahedronActual), 0.000001);

    }
}
