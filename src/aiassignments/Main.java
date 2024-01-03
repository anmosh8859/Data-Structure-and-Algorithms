package aiassignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
class Board implements Comparable<Board> {
    protected int[][] tiles;
    protected int size;

    protected int manhattanDistance;
    protected int moves;
    protected Board previous;

    Board(int[][] tiles) {
        size = 3;
        this.tiles = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.tiles[i][j] = tiles[i][j];
            }
        }
        manhattanDistance = calculateManhattanDistance();
        moves = 0;
        previous = null;
    }

    private int calculateManhattanDistance() {
        int distance = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = tiles[i][j];
                if (value != 0) {
                    int targetRow = (value - 1) / size;
                    int targetCol = (value - 1) % size;
                    distance += Math.abs(i - targetRow) + Math.abs(j - targetCol);
                }
            }
        }
        return distance;
    }

    int getManhattanDistance() {
        return manhattanDistance;
    }

    int getMoves() {
        return moves;
    }

    Board getPrevious() {
        return previous;
    }

    boolean isGoal() {
        int[][] target = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        return Arrays.deepEquals(tiles, target);
    }

    Iterable<Board> getNextMoves() {
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int emptyRow = -1, emptyCol = -1;

        // Find the empty space
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (tiles[i][j] == 0) {
                    emptyRow = i;
                    emptyCol = j;
                    break;
                }
            }
        }

        HashSet<Board> nextMoves = new HashSet<>();
        for (int[] move : moves) {
            int newRow = emptyRow + move[0];
            int newCol = emptyCol + move[1];

            if (newRow >= 0 && newRow < size && newCol >= 0 && newCol < size) {
                int[][] newTiles = new int[size][size];
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        newTiles[i][j] = tiles[i][j];
                    }
                }

                // Swap the empty space with the adjacent tile
                newTiles[emptyRow][emptyCol] = newTiles[newRow][newCol];
                newTiles[newRow][newCol] = 0;

                nextMoves.add(new Board(newTiles));
            }
        }

        return nextMoves;
    }

    @Override
    public int compareTo(Board other) {
        int priority1 = moves + manhattanDistance;
        int priority2 = other.moves + other.manhattanDistance;
        return priority1 - priority2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Board other = (Board) obj;
        return Arrays.deepEquals(tiles, other.tiles);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(tiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(tiles[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int[][] getTiles() {
        return tiles;
    }

    public void setTiles(int[][] tiles) {
        this.tiles = tiles;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] initial = {{1, 2, 3}, {4, 5, 6}, {8, 7, 0}};
        Board initialBoard = new Board(initial);

        if (isSolvable(initialBoard)) {
            Board finalBoard = solvePuzzle(initialBoard);
            if (finalBoard != null) {
                System.out.println("Solution found:");
                printSolution(finalBoard);
            } else {
                System.out.println("No solution found.");
            }
        } else {
            System.out.println("The puzzle is not solvable.");
        }
    }

    private static boolean isSolvable(Board initialBoard) {
        int inversions = countInversions(initialBoard);
        return inversions % 2 == 0;
    }

    private static int countInversions(Board board) {
        int count = 0;
        int[] flattened = flatten(board);
        for (int i = 0; i < flattened.length; i++) {
            for (int j = i + 1; j < flattened.length; j++) {
                if (flattened[i] != 0 && flattened[j] != 0 && flattened[i] > flattened[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[] flatten(Board board) {
        int[] flattened = new int[9];
        int index = 0;
        for (int i = 0; i < board.getTiles().length; i++) {
            for (int j = 0; j < board.getTiles().length; j++) {
                flattened[index++] = board.getTiles()[i][j];
            }
        }
        return flattened;
    }

    private static Board solvePuzzle(Board initialBoard) {
        PriorityQueue<Board> pq = new PriorityQueue<>();
        pq.offer(initialBoard);

        HashSet<Board> visited = new HashSet<>();
        visited.add(initialBoard);

        while (!pq.isEmpty()) {
            Board current = pq.poll();

            if (current.isGoal()) {
                return current;
            }

            Iterable<Board> nextMoves = current.getNextMoves();
            for (Board move : nextMoves) {
                if (!visited.contains(move)) {
                    move.moves = current.moves + 1;
                    move.previous = current;
                    pq.offer(move);
                    visited.add(move);
                }
            }
        }

        return null;
    }

    private static void printSolution(Board board) {
        if (board != null) {
            while (board != null) {
                System.out.println(board);
                board = board.getPrevious();
            }
        }
    }
}
