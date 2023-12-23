public class DungeonGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position of Gold");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter position of Adventure");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        

        System.out.println("Enter position of Monster");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

  
        int steps = Math.abs(row-row1)+Math.abs(col-col1);
        int stepsmon=Math.abs(row-row2)+Math.abs(col-col2);
        if(stepsmon<steps) {
        System.out.println("Its Imposible");
        }else
        	System.out.println(steps);
       
    }
}

