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

        System.out.println("Enter position of Triger");
    int row3 = sc.nextInt();
     int col3 = sc.nextInt();
       int adsteps= Math.abs(row-row1)+Math.abs(col-col1);
     
    
        int steps = Math.abs(row1-row3)+Math.abs(col1-col3);
       int minsteps=Math.abs(row3-row)+Math.abs(col3-col);
       int monststeps=  Math.abs(row2-row)+Math.abs(col2-col);
      
       int shorts=steps+minsteps;
       if(adsteps<monststeps) 
       	   System.out.println("Shortest Step Distance Is"+" "+adsteps);
       else if(monststeps<shorts) {
    	   System.out.println("Shortest Step Distance Is"+" "+shorts);
       }
       
    }}
