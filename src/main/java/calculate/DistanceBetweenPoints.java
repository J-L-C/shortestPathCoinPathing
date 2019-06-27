package calculate;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DistanceBetweenPoints {

    private Integer[][] convertedMap;
    private List<Point> points;


    public int calculateMovesWithWallsGivenTwoPoints(List<List<Integer>> map, Path path) {

        int distance = 0;

        if(map.size() < 1)
            return distance;

        convertTo2dArray(map);
        identifyPoints();


        for (int i = 0; i < convertedMap.length; i++){
            for (int j = 0; j < convertedMap[i].length; j++){
                System.out.print(convertedMap[i][j] + " ");
            }
        }

        return distance;
    }

    private void convertTo2dArray(List<List<Integer>> map) {

        convertedMap = new Integer[map.size()][];

        for (int i = 0; i < map.size(); i ++){
            List<Integer> row = map.get(i);
            convertedMap[i] = row.toArray(new Integer[row.size()]);
        }

    }

    private void identifyPoints() {
        points = new ArrayList<>();

        for (int i = 0; i < convertedMap.length; i++){
            for (int j = 0; j < convertedMap[i].length; j++){
                if (convertedMap[i][j] == 1){
                    points.add(new Point(i,j));
                }
            }
        }
    }

    public List<Point> getPoints() {
        return points;
    }
}
