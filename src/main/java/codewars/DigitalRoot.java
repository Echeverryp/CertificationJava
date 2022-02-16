package codewars;

public class DigitalRoot {

    public static int digital_root_mine(int n) {
        String number=String.valueOf(n);
        int i=0;
        int valor=0;
        while(number.length()>1){
            if(number.length()==i){
                number=String.valueOf(valor);
                valor=0;
                i=0;
            }else{
                valor+=Integer.parseInt(String.valueOf( number.charAt(i)));

                i++;
            }


        }
        return Integer.parseInt(number);
        // ...
    }
    public static int digital_root1(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static int digital_root2(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        return(n);
    }

    public static void main(String[] args) {
        System.out.println(digital_root2(16));
    }
}
