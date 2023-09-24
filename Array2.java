 import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of Row");
        int row = sc.nextInt();
System.out.println("Enter no of Column");
int col = sc.nextInt();
int[][] num = new int[row][col];
//for input
for(int i=0; i<num.length; i++){
    for(int j=0; j<num.length; j++){
        System.out.println(String.format("Enter first[%d][%d] integer", i, j));
         num[i][j]= sc.nextInt();
    }
}
//for output
System.out.println("ORIGINAL MATRIX");
for (int i=0; i<num.length; i++){
    for(int j=0; j<num.length; j++){
        System.out.print(num[j][i] + " ");
    }
    System.out.println();
    
}
//TRANSAPOSE
System.out.println("TRANSPOSED MATRIX");
for (int j=0; j<num.length; j++){
    for(int i=0; i<num.length; i++){
        System.out.print(num[j][i] + " ");
    }
    System.out.println();


}
System.out.println("ENTER THE No.");
int x = sc.nextInt();
for(int i=0; i<num.length; i++){

for(int j=0; j<num.length; j++){
if(num[i][j]==x){
    System.out.println("X found at ("+i+"),("+j+")");
}
else{
    System.out.println("No.has not been found");
}
}
}
sc.close();
    }
}

