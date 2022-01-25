public class RatInMaze {
    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        boolean pathPossible = ratInMaze(maze);
        System.out.println(pathPossible);
    }

    public static boolean ratInMaze(int[][] maze) {
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
        return false;
    }
}
