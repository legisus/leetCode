public class Main {

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.numIdenticalPairs(new int[]{1,2,3}));


        MyHashMap obj = new MyHashMap();
        obj.put(5, 10);
        System.out.println(obj.get(5));
        obj.remove(5);
        System.out.println(obj.get(5));



    }
}
