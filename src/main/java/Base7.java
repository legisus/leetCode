public class Base7 {
    public String convertToBase7(int num) {
        int temp = Math.abs(num);
        int r;

        StringBuilder sb = new StringBuilder();
        while (temp != 0) {
            r = temp % 7;
            temp = temp / 7;
            sb.append(r);
        }
        return num < 0 ? "-" + sb.reverse().toString() : sb.reverse().toString();
    }

    public static void main(String[] args) {
        Base7 b = new Base7();
        System.out.println(b.convertToBase7(7));
        System.out.println(b.convertToBase7(-7));
    }
}
