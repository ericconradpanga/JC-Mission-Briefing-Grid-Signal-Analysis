package org.example;

public class GridSignalAnalyzer {
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };;

    public GridSignalAnalyzer() {
    }

    public void analyzeWithForLoop() {
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void analyzeWithForEachLoop() {
        for (char[] rowArray : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char column : rowArray) {
                System.out.print("-> " + column + "\n");
            }
        }
    }

    public void analyzeWithHybridLoop() {
        for (char[] rowArray: scrambledGrid) {
            for (int i = 0; i < rowArray.length; i++) {
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }
    }
}
