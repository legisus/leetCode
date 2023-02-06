import java.io.*;
class ArithmeticOperators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = 0.0;
        double tax = 0.0;
        double total = 0.0;
//        int t = 0;

        tip = meal_cost * tip_percent / 100;
        tax = meal_cost * tax_percent / 100;
        total = tip + tax + meal_cost;
//        t = (int) (Math.round(total));


        System.out.println(Math.round(total));
    }

   public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        ArithmeticOperators.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
