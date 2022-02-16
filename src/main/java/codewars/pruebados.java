package codewars;


    import java.util.ArrayList;
    import java.util.List;
    import java.util.function.Consumer;

public class pruebados {
//public class pruebados extends prueba{

    public static int[] parse(String data) {
        int value = 0;
        List<Integer> result = new ArrayList<>();
        for(char letter : data.toCharArray()) {
            switch(letter) {
                case 'i': value++; break;
                case 'd': value--; break;
                case 's': value *= value; break;
                case 'o': result.add(value); break;
                default: throw new IllegalArgumentException("Not valid code letter");
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuffer stringBuffer=new StringBuffer();
        int i=0;
        int j=0;
        for (int num:numbers
             ) {
            if(i%3==0){
                if(i==0){
                    stringBuffer.append("(");
                }
                else if (i==3){
                    stringBuffer.append(") ");
                }
                else{
                    System.out.println("oli" + i);
                    if(j==2){
                        stringBuffer.append("-");

                    }
                }
                j++;
            }
            stringBuffer.append(String.valueOf(num));
            i++;
        }
        return stringBuffer.toString();
    }

    public static String createPhoneNumber1(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

    public static int digital_root(int n) {
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



    public static void main(String[] args) {
        Consumer<String> consumer =p-> System.out.println(p);
        Consumer<String> consumer2 =p-> System.out.println("chaoli"+p);
        consumer.andThen(consumer2).accept("oli");
        System.out.println(digital_root(132189));

        /*System.out.println(String.format("(%d%d)",1,2));

        System.out.println(createPhoneNumber(new int[]{1,2,3,4,5,6,7,9}));
        //Arrays.stream(pruebados.parse("iiisdoso")).asDoubleStream().forEach(System.out::println);*/
    }

}
