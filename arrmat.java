import java.util.Scanner;

public class arrmat {
    public  void matrix(int mat[][]){
        

        for (int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("TRANSPOSE");
        for (int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[j][i] + "\t");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        arrmat am = new arrmat();
        int mat[][] = {{3,5,7},{4,8,2},{2,5,7}};
        am.matrix(mat);
        
    }
}
