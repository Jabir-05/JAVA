public class Ex2 {
    public static void main(String[] args) {
        int [][] matrix = {
            {2,3,5,7,},
            {4,5,8,0,},
            {1,3,4,5,}
        };
            System.out.println("Elememt of  2D aray is");
            for(int i =0; i<matrix.length; i++){
                for( int j=0;j<matrix[i].length; j++){
      System.out.println(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
