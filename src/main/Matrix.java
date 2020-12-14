package main;

import java.util.HashMap;

public class Matrix {

    private HashMap<Point, Integer> matrix = new HashMap<>();

    /**
     * Update matrix value at a given row and column
     * @param row row of the matrix
     * @param col column of the matrix
     * @param val value to set
     */
    public void set(int row, int col, int val) {
        matrix.put(new Point(row, col), val);
    }

    /**
     * return the sum of values from the top left corner
     * to the given row, column sub-matrix
     * @param row row of the matrix
     * @param col column of the matrix
     * @return sum of chosen matrix values
     */
    public long sum(int row, int col) {
        long summary = 0;
        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                summary += get(r, c);
            }
        }
        return summary;
    }

    private int get(int row, int col) {
        Integer value = matrix.get(new Point(row, col));
        if (value == null) {
            return 0;
        }
        return value;
    }

    // delete before release
    public void printMatrix(int row, int col) {
        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                System.out.print(get(r, c) + " ");
            }
            System.out.println();
        }
    }

}
