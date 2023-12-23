public class DungeonGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position of Gold");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter position of Adventure");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int steps = Math.abs(row-row1)+Math.abs(col-col1);
        System.out.println("Shortest Path Is" + steps);
    }
}
