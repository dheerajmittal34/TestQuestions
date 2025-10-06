public class TempleMoves {

    public static void solveHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total moves: " + ((int) Math.pow(2, n) - 1));
        solveHanoi(n, 'A', 'B', 'C');  
    }
}
