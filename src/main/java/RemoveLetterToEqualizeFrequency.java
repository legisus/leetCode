public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        char[] chars = word.toCharArray();
        char[] r = new char[chars.length];
        char[] q = new char[chars.length];
        boolean b = false;



        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(r[i] != chars[j]){
                    r[i] = chars[i];
                }else {
//                    if (q[1] != )
//                    q[i] = chars[i];

                }
            }
        }
       return b;
    }


    public static void main(String[] args) {
        char[] c = new char[5];

        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';


        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(c.length);
    }
}
