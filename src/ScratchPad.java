
public class ScratchPad {
    public static void main(String[] args) {

        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] rotate = rotate(grid);

        int[][] ints = rotateReverse(grid);
        print(ints);
        System.out.println(" == ");

        print(rotate);
    }

    static int[][] rotate(int[][] grid){
        int[][] result = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[j][grid.length-i-1] = grid[i][j];
            }
        }
        return result;
    }
    static int[][] rotateReverse(int[][] grid){
        int[][] result = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[grid[0].length-j-1][i] = grid[i][j];
            }
        }
        return result;
    }

    static void print(int grid[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }

}


