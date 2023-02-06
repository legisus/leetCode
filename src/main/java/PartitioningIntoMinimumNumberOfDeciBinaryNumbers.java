import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

//    public int minPartitions(String n) {
//        int[] i = new int[n.length()];
//        int max = 0;
//        for (int j = 0; j < n.length(); j++) {
//            i[j] = Integer.parseInt(n.substring(j,j+1));
//        }
//        for (int j = 0; j < i.length; j++) {
//            if(i[j] > max) max = i[j];
//        }
//        return max;
//    }

    public int minPartitions(String n) {
        int max = 0;

        for (int i = 0; i < n.length(); i++){
            max = Math.max(max, (int)(n.charAt(i)-'0') );
        }
        return max;

    }

    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers p = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

        System.out.println(p.minPartitions("9432"));
    }

}
