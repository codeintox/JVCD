import java.util.*;
public class Array3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r= sc.nextInt();
        System.out.println("Enter no of column");
        int c= sc.nextInt();
        int mat[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
             mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i= 0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j]==x){
                    System.out.println("X found at "+ r +","+ c +"");
                }
                        }
        }
    }
}