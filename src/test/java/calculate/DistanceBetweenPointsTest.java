package calculate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistanceBetweenPointsTest {

    DistanceBetweenPoints distanceBetweenPoints;
    Path emptyPath = new Path();
    List<List<Integer>> map;

    @Before
    public void setUp(){
        map = new ArrayList<>();
        distanceBetweenPoints = new DistanceBetweenPoints();
    }

    @Test
    public void calculateMovesWithWallsGivenTwoPoints_givenASinglePointThatIsTheStartingPointInA2DArrayReturnZeroDistance() {
        map.add(Arrays.asList(1));
        Assert.assertEquals(0, distanceBetweenPoints.calculateMovesWithWallsGivenTwoPoints(map, emptyPath));
    }

    @Test
    public void calculateMovesWithWallsGivenTwoPoints_givenAStartingPointAndACoinReturn1ForTheNumberOfSpacesNeededToMoveTo() {

        Point start = new Point(0,0);
        Point end = new Point(0,1);
        Path path = new Path(start, end);

        map.add(Arrays.asList(1,1));

        Assert.assertEquals(1, distanceBetweenPoints.calculateMovesWithWallsGivenTwoPoints(map, path));
    }

    @Test
    public void identifyPoints_givenAMapWithOneCoinHasOneRowThreeColumnReturnTheRowAndColumnOfACoin() {

        List<Point> points = Arrays.asList(new Point(0,2));
        map.add(Arrays.asList(0,0,1));

        distanceBetweenPoints.calculateMovesWithWallsGivenTwoPoints(map, emptyPath);

        Assert.assertEquals(points, distanceBetweenPoints.getPoints());
    }

    @Test
    public void identifyPoints_givenAMapWithTwoCoinsAndHasTwoRowsThreeColumnReturnThePointsForEachCoin() {

        Point point1 = new Point(0,2);
        Point point2 = new Point(1,1);
        Point point3 = new Point(2,2);

        map.add(Arrays.asList(0,0,1));
        map.add(Arrays.asList(0,1,0));
        map.add(Arrays.asList(0,0,1));

        List<Point> points = Arrays.asList(point1,point2, point3);
        distanceBetweenPoints.calculateMovesWithWallsGivenTwoPoints(map, emptyPath);

        Assert.assertEquals(points, distanceBetweenPoints.getPoints());
    }
}