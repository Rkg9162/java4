
// A print using do while loop 
public class pitnAwithdoWhileLoop {
    public static void main(String[] args) {
        int i=0;
        do{
            int j=0;
            do{
                if (i==0 || j==0 ||  i==5 ||j==9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            while(j<10);
            System.out.println();
            i++; 
        }
        while (i<10);
        
            
        
    }
    
}
