public class recTile {
    public static int tileset(int m, int n){
        if(m==n){
            return 2;
        }
        if(m<n){
            return 1;
        }
        //Vertically
         int possibility1 = tileset(m-n,n);
        //Horizontally
        int possibility2 = tileset(m-1,n);
        return (possibility1+possibility2);

        
    }
    public static void main(String[] args) {
        int m = 1, n = 2;
        System.out.println(tileset(m, n));
    }
}
