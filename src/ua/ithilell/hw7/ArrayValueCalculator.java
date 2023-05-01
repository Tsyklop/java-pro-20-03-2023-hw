package ua.ithilell.hw7;

public class ArrayValueCalculator {

    public int doCalc(String[][] matrix) {

        if (matrix.length != 4) {
            throw new ArraySizeException(-1, matrix.length);
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new ArraySizeException(i, matrix[i].length);
            }
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                    //System.out.println("Error in [" + i + "][" + j + "] element. skip.");
                }
            }
        }

        return sum;

    }

}
