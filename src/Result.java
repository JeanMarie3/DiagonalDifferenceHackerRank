import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int SumFirstDiagonal = 0;
        int SumSecondDiagonal = 0;
        for(int i = 0; i < arr.size(); i++) {
            SumFirstDiagonal += arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            SumSecondDiagonal += arr.get(i).get(arr.size() - (i + 1));
        }
        return Math.abs(SumFirstDiagonal - SumSecondDiagonal);


    }

}
