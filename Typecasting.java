public class Typecasting {
    public static void main(String[] args) {
        byte b = (byte) (300);
        short s = 78;
        int i = 87687;
        long l = 2878_75667;
        b=(byte)i;
        char ch='a';
        int x = ch;
        System.out.println(x);
        ch++;
        System.out.println(ch);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        for(byte j=0;j<127;j++)
        {
            System.out.println(j);
        }

    }
}
