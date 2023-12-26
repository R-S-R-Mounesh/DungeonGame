public class DungeonGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position of Gold");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter position of Adventure");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        

        System.out.println("enter the bits");  
        
        int bits=sc.nextInt();
        int i=1;
        int  bitrow = 0;
        int bitcol=0;;
        while(bits>0) {
        	System.out.println("enter bit"+i);
        	  bitrow = sc.nextInt();
             bitcol = sc.nextInt();
             i++;
             bits--;
        }
        int bitses = Math.abs(bitrow-row)+Math.abs(col-col1);
        System.out.println(bitses);
       int mindist=Math.abs(row-row1)+Math.abs(col-col1);
       System.out.println(mindist);
       
       if(bitses>mindist) {
    	   System.out.println("imposible");
       }else
       System.out.println(mindist);
    
    }}
 
