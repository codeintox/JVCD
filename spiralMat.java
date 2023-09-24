import java.util.Scanner;

public class spiralMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no row");
        int m = sc.nextInt();
        System.out.println("Enter no col");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        //for INPUT
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println(String.format("Enter the [%d][%d] no", i, j));
                mat[i][j]=sc.nextInt();
            }
        }
        //for output
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] +  " ");

            }
            System.out.println();
        }

        
        System.out.println("SPIRALING OF THE MATRIX");
        int l=0, r=n-1, t=0, b=m-1;
        //To print the spiral order of Matrix
        while(l<=r & t<=b){
            for(int i=l; i<=r; i++){
                System.out.print(mat[t][i] + "");
            }
            t++;
            for(int i=t; i<=b; i++){
                System.out.print(mat[i][r] + "");
            }
            r--;
            for(int i=r; i>=l; i--){
                System.out.print(mat[b][i] + "");
                }
            b--;
            for(int i=b; i>=t; i--){
                System.out.print(mat[i][l] + "");
            } 
            l++;   
        System.out.println();
        }

    }
}
