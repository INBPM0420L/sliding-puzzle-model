package slidingpuzzle.solver;

import puzzle.solver.BreadthFirstSearch;
import slidingpuzzle.model.Direction;
import slidingpuzzle.model.PuzzleState;

public class Main {

    public static void main(String[] args) {
        var bfs = new BreadthFirstSearch<Direction>();
        bfs.solveAndPrintSolution(new PuzzleState());
    }

}
