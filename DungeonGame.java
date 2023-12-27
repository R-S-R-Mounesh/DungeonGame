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
	       int mindist=Math.abs(row-row1)+Math.abs(col-col1);
	       int monstSteps=Math.abs(row-row2)+Math.abs(col-col2);
	       if(monstSteps<mindist) {
	    	   System.out.println("No Possible Solution");
	       }else
	       System.out.println("Minumum Number Of Steps"+mindist);
	    
	    }}
