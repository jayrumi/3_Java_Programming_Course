package test.erumyantsev.figure.action;

import org.erumyantsev.figure.action.TetrahedronCalculating;
import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.entity.Tetrahedron;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yauheni_Rumiantsau on 6/18/2017.
 */
public class TetrahedronVolumeTest {

    @Test
    public void tetrahedronVolumeCheck(){

        float expectedVolume = (float) 149.02321;

        Point pointA = new Point((float) 5.02, (float) 10.13, (float) 5.08);
        Point pointB = new Point((float) 0.04, (float) 0.09, (float) 0.01);
        Point pointC = new Point((float) 12.11, (float) 0.07, (float) 0.06);
        Point pointD = new Point((float) 1.16, (float) 1.02, (float) 7.57);

        Tetrahedron tetrahedronActual = new Tetrahedron(pointA, pointB, pointC, pointD);
        TetrahedronCalculating actualVolume = new TetrahedronCalculating();

        Assert.assertEquals(expectedVolume, actualVolume.volumeTetrahedron(tetrahedronActual), 0.00001);

    }
}
