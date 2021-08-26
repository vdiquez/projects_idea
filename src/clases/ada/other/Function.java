package clases.ada.other;

public class Function {
    public static void main(String[] args) {
        int n ;
        // TODO Auto-generated method stub
        //Cuando n = 6
        n=6;

        System.out.println(suma(n));
    }

    public static int suma(int n) {
        int res = 0;
        if( n > 0) {
            res= suma(n-1);
            System.out.println(res);
            if (n % 2 ==0) {
                res=res+n;
            }
        }

        return res;
    }


}
