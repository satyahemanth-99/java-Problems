public class Array012 {
    static void main(String[] args) {
        int[][] nums = new int[3][6];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 6; b++){
                System.out.print(nums[a][b] + " ");
            }
            System.out.println(" ");
        }
    }
}