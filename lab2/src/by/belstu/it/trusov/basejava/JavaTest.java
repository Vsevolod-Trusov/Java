package by.belstu.it.trusov.basejava;
/**
 * @author Vsevolod Trusov
 * @version 2.1*/
public class JavaTest {
    static int sint ;
    /*public final int obj1;
    public static final int obj2;*/
/**
 * @return  возвращает демонстрацию лабороторной работы
 * @param   args  передается массив значений в метод с помощью командной строки

  */
    public static void main(String[] args) {

        System.out.println("Helo From JavaTest");
        System.out.println("Let's start working");
        System.out.println(sint);
        String stringExample = "Seva";
        /**
         * @value переменная для символьного типа данных*/
        char charExample = 'S';
        int intExample = 10;
        double doubleExample = 11D;
        short shortExample = 5;
        byte byteExample = 2;
        long longExample = 100L;
        boolean booleanExample =true;
        System.out.println(stringExample + intExample);
        System.out.println(stringExample + charExample);
        System.out.println(stringExample + doubleExample);
        System.out.println(byteExample + intExample);
        byteExample = (byte)(byteExample + intExample);
        System.out.println(doubleExample + longExample);
        intExample = (int)(doubleExample + longExample);
        System.out.println(intExample + (long)2147483647);//положительное
        longExample = (long)(intExample + 2147483647);

        System.out.println(booleanExample && booleanExample);
        booleanExample = booleanExample && booleanExample;
        System.out.println(booleanExample ^ booleanExample);
        booleanExample = booleanExample ^ booleanExample;


        long longNumb = 9223372036854775807L;
        long longNumb2 = 0x7fff_ffff_fffL;

        System.out.println(3.45 % 2.4);
        System.out.println(1.0 % 0.0);
        System.out.println(Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        final int finalIntNumb;
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));
        System.out.println(Math.min(Math.E, Math.PI));
        System.out.println(Math.random());


        Double doubleExample2 = 12.33D;
        Boolean booleanExamp = false;
        Character character = 'A';
        Integer integer = 10;
        Byte bt = 2;
        Short sh = 8;
        Long l2 = 321L;

        doubleExample2 += 100D;
        System.out.println(doubleExample2);
        integer = integer >>5;
        System.out.println(integer);
        booleanExamp = booleanExamp | booleanExamp;
        System.out.println(booleanExamp);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);

        int a = 5;
        Integer a2 = a;// упаковка
        int b = (int)a2;// распаковка

        byte b3 =2;
        Byte b2 = b3;
        byte b4 = (byte)b2;
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.toHexString(25));
        System.out.println(Integer.compare(25, 30));
        System.out.println(Integer.toString(25));
        System.out.println(Integer.bitCount(25));
        //System.out.println(Number.isNaN(25));

        System.out.println(Integer.parseInt("555"));
        System.out.println(Integer.valueOf("555"));
        System.out.println("123".getBytes());
        System.out.println("123".getBytes().toString());
        System.out.println(Boolean.parseBoolean("true"));
        String string = ""+Boolean.parseBoolean("true");
        System.out.println(string);

        String str1 = null;
        String str2 = "5";
        String str3 = new String("5");
        System.out.println(str1 == str2);
        System.out.println(str3.equals(str2));
        System.out.println(str3.compareTo(str2));

        String str4 = "Hi I'm Seva";
        String res[] = str4.split(" ");
        System.out.println(res[0]);
        System.out.println(str4.contains("I"));
        System.out.println(str4.hashCode());
        System.out.println(str4.indexOf('H'));
        System.out.println(str4.length());
        System.out.println(str4.replace('e', 'E'));

        char e1[][];
        char [] e2[];
        char [][] e3;

        e3 = new char [3][];
        e3[0] = new char [1];
        e3[1] = new char [2];
        e3[2] = new char [3];

        e2 = new char [2][];
        e2[0] = new char [2];
        e2[1] = new char [2];
        e2[0][0] = 'a';
        e2[0][1] = 'b';
        e2[1][0] = 'c';
        e2[1][1] = 'b';

        e1 = new char [2][];
        e1[0] = new char [2];
        e1[1] = new char [2];
        e1[0][0] = 'a';
        e1[0][1] = 'b';
        e1[1][0] = 'c';
        e1[1][1] = 'b';

        for (int i = 0; i < e2.length; i++) {
            for (int j = 0; j < e2[i].length; j++) {
                    System.out.print(e2[i][j]);
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(e2 == e3);


        WrapperString wrapperString = new WrapperString();
        wrapperString.replace('e', 'Z');
        WrapperString noName = new WrapperString(){
            private String c = "HELLO";

            public String getC() {
                return c;
            }

            public void setB(String c) {
                this.c = c;
            }

            public void replace(char oldchar, char newchar){
                c.replace(oldchar, newchar);
                System.out.println("new" +c);
            }

            public void delete(char oldchar){
                int h = c.indexOf(oldchar);
                System.out.println(h);
            }
        };
        noName.replace('L', 'C');
        noName.delete('H');





    }
}
