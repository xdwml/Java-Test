package basic;

public class StringEquals {
    public static void main(String[] args) {
        String s1=new String("xyz");
        String s2=new String("xyz");
        Boolean b1=s1.equals(s2);
        Boolean b2=(s1==s2);
        System .out.println(b1+" "+b2);
        char[] ch={'x','y','z'};
        String s3=ch.toString();
        Boolean b3=s3.equals(s1);
        Boolean b4=(s3==s1);
        System .out.println(b3+" "+b4);
        Integer a = 1;
        Integer b = 1;
        Integer c = 500;
        Integer d = 500;
        System.out.print(a == b);
        System.out.print(c == d);
    }

}
