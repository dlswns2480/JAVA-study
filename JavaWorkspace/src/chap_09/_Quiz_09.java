package chap_09;

// 유재석 파이썬
// 박명수 자바
// 김종국 자바
// 조세호 C
// 서장훈 파이썬

// 자바 자격증을 보유한 학생
// ---------------------
// 박명수
// 김종국

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        for (Student student : list) {
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}

class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}