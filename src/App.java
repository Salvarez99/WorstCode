import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers to multiply: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int ans = num1 * num2;
        ArrayList<Pair> pairList = findPairs(ans);
        Random rand = new Random();
        
        for (int i = 0; i < pairList.size(); i++) {
            int index = rand.nextInt(0, pairList.size());
            Pair pair = pairList.get(index);
            System.out.println("Did you mean: " + pair.num1 + " * " + pair.num2 + "?");
            Thread.sleep(1000);
        }
    }

    public static ArrayList<Pair> findPairs(int answer) {
        ArrayList<Pair> pairs = new ArrayList<>();
        for (int i = 1; i < Math.abs(answer) + 1; i++) {
            if (answer % i == 0) {
                int b = answer / i;
                pairs.add(new Pair(i, b));
                if (i != b) {
                    pairs.add(new Pair(-i, -b));
                }
            }
        }
        return pairs;
    }
}
