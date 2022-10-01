
public class NumOfIslands {
    public int numIslands(char[][] grid) {
        int number = 0;
        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[0].length; n++) {
                if (grid[m][n] == '1') {
                    visiteIsland(grid, m, n);
                    number++;
                }
            }
        }
        return number;
    }

    private void visiteIsland(char[][] grid, int m, int n) {
        if (m >= 0 && m < grid.length && n >= 0 && n < grid[0].length && grid[m][n] == '1') {
            grid[m][n] = '0';
            visiteIsland(grid, m + 1, n);
            visiteIsland(grid, m - 1, n);
            visiteIsland(grid, m, n + 1);
            visiteIsland(grid, m, n - 1);
        }
        return;
    }

    public static void main(String[] args) {
        NumOfIslands sticks = new NumOfIslands();
        char[][] grid = new char[][] {
                // { '1', '1', '1', '1', '0' },
                // { '1', '1', '0', '1', '0' },
                // { '1', '1', '0', '0', '0' },
                // { '0', '0', '0', '0', '0' }
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.println(sticks.numIslands(grid));
    }
}
