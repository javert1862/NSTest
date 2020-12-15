package main;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

    //changed due to visual testing
    public HashMap<Point, Integer> matrixMap = new HashMap<>();

    /**
     * Update matrix value at a given row and column
     * @param row row of the matrix
     * @param col column of the matrix
     * @param val value to set
     */
    public void set(int row, int col, int val) {
        matrixMap.put(new Point(row, col), val);
    }

    /**
     * return the summary of values from the top left corner
     * to the given row, column sub-matrix
     * @param row row of the matrix
     * @param col column of the matrix
     * @return summary of chosen matrix values
     */
    public int sum(int row, int col) {
        return  matrixMap.entrySet().stream()
                .filter(entry -> entry.getKey().getRow() <= row && entry.getKey().getColumn() <= col)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

}
