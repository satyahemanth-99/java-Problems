public class Array014 {
    static void main(String[] args) {
        int[][] nums = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[4];
        for( int n[] : nums){
            for(int s : n){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
