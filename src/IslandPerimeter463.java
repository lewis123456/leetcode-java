/**
 * @Author lpf
 * @Date 2/8/18 1:48 AM
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        if (null == grid) {
            return 0;
        }
        int x = grid.length;
        if (0 == x) {
            return 0;
        }
        int y = grid[0].length;
        int result = 0;
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (0 == grid[i][j]) {
                    continue;
                } else {
                    if (i-1 >= 0 && 0 == grid[i-1][j] || i-1 < 0) {
                        ++result;
                    }
                    if (i+1 < x && 0 == grid[i+1][j] || i+1 >= x) {
                        ++result;
                    }
                    if (j-1 >= 0 && 0 == grid[i][j-1] || j-1 < 0) {
                        ++result;
                    }
                    if (j+1 < y && 0 == grid[i][j+1] || j+1 >= y) {
                        ++result;
                    }
                }
            }
        }
        return result;
    }
}
