public class recmoveallx {

    public static void movex(String Ostr, int idx, int count, String Nstr) {
        if(idx == Ostr.length()){
           
            System.out.println(Nstr+=count);
            return;
        }
        
    
        char curChar =  Ostr.charAt(idx);
        if(curChar == 'x'){
            count ++;
            movex(Ostr, idx+1, count, Nstr);

        }else{
            Nstr += curChar; // Nstr = Nstr + curchar
            movex(Ostr, idx+1, count, Nstr);
        }
        
    }  
    
    public static void main(String[] args) {
        String Ostr = "axdfxxdv";
        movex(Ostr, 0, 0, " ");
    }

    }
