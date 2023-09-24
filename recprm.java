public class recprm {
    public static void prm(String str, String perm) {
if(str.length()==0){
    System.out.println(perm);
    return;

}
        for(int i=0; i<str.length(); i++){
    char curchar = str.charAt(i);
    String nstr= str.substring(0, i) + str.substring(i+1);
    prm(nstr, perm+curchar);
}        
        
    }
    public static void main(String[] args) {
        String str = "SRT";
        prm(str, " ");
    }
}
