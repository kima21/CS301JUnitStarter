package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception{
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y,0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0,5, -3);
        testPoints.setPoint(1,-3,5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);

    }

    @Test
    public void randomValue() throws Exception{
        TwoPoints testPoints = new TwoPoints();

        testPoints.randomValue(0);
        testPoints.randomValue(1);

        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);

        assertTrue(p1.x > -10 && p1.x < 10);
        assertTrue(p1.y > -10 && p1.y < 10);
        assertTrue(p2.x > -10 && p2.x < 10);
        assertTrue(p2.y > -10 && p1.y < 10);

    }

    @Test
    public void setOrigin() throws Exception {
        TwoPoints testPoints = new TwoPoints();

        testPoints.setPoint(0,5, -3);
        testPoints.setOrigin(0);

        Point p1 = testPoints.getPoint(0);

        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);

    }

    @Test
    public void copy() throws Exception {
        TwoPoints testPoints = new TwoPoints();

        testPoints.setPoint(0,5, -3);
        testPoints.setPoint(1,-3,5);
        testPoints.copy(0 ,1);

        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);

        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);

    }

    @Test
    public void distance() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.distance();
        int xDiff;
        int yDiff;


    }

    @Test
    public void slope() throws Exception {
        TwoPoints testPoints = new TwoPoints();

    }
}