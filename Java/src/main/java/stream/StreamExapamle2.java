package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExapamle2 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("a", Member.MALE, 30),
                new Member("b", Member.FEMALE, 20),
                new Member("c", Member.FEMALE, 80),
                new Member("d", Member.MALE, 40)
        );
        double ageAvg = list.stream()
                .filter(s -> s.getSex()==Member.MALE)//중간처리
                .mapToInt(Member::getAge)//중간 처리
                .average()//최종처리
                .getAsDouble();
        System.out.println("male avg age : " + ageAvg);
    }
}
