package strings;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;
        s1.marks = 90;
        s2.marks = 95;
        System.out.println("S1 marks : " + s1.marks); // 95
        System.out.println("S2 marks : " + s2.marks); // 95

        String str = "ABCD";
        String str1 = str;
        str = str + "E";
        System.out.println(str);
        System.out.println(str1);

        String x = "ABCD";
        x = x  + (1 + 2);
        System.out.println(x);

        String y = "A";
        y = y + 'B';
        y = y + 1;
        System.out.println(y);
    }
}
