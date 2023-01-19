package chap_06;

public class Quiz06 {
    public static void certificate(String name, String number, String phone){
        String name_1 = name.replace(name.substring(1), "*");
        String individualNum = number.replace(number.substring(8), "*");
        String phoneNum = phone.replace(phone.substring(9), "*");
        System.out.println(name_1);
        System.out.println(individualNum);
        System.out.println(phoneNum);
    }

    public static void main(String[] args) {
        String a = "최인준";
        String b = "000914-35353535";
        String c = "010-3462-2480";
        certificate(a,b,c);
    }
}
