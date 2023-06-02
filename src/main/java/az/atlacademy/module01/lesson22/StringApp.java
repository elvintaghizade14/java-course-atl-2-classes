package az.atlacademy.module01.lesson22;

public class StringApp {

    public static void main(String[] args) {
        String a1 = "A";
        String a2 = a1 + a1;
        String a3 = a1.concat(a1).concat(a1);
        System.out.println(a1);
        System.out.println(a2);

        String sb = new StringBuilder()
                .append(1)
                .append("1")
                .append(true)
                .toString();
        System.out.println(sb);

        String sbf = new StringBuffer()
                .append(2)
                .append("2")
                .append(false)
                .toString();
        System.out.println(sbf);
    }

}
