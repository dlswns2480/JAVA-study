package chap_03;

public class _03_StrinfCompare {
    public static void main(String[] args) {
        String s = "Java";
        String s2 = "Python";
        System.out.println(s.equals(s2));
        System.out.println(s2.equalsIgnoreCase("python"));


        //문자열 비교 심화
        s = "1234";
        s2 = "1234";
        System.out.println(s.equals(s2)); //내용 비교
        System.out.println(s == s2); //참조 비교

        s = new String("1234");
        s2 = new String("1234");

        System.out.println(s.equals(s2)); //내용 비교
        System.out.println(s==s2); //false





    }
}
