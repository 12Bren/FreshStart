package sample.problemDoamin;

public class SudokuGame {
    private final GameState gameState;
    private final int [][] gridState;

    public static final int GRID_BOUNDARY = 9; // represents number of squards in sudoku
    // puzzile


    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }
}
