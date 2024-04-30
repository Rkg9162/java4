public class advancePatternLoop {
    public static void main(String[] args) {
        int i=0;
        do{
            int j =0;
            do{
                if (i==0 || j==0 || i==4 || j==4)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
                
            }
            while(j<5);
            System.out.println();
            i++;
        }
        while (i<5);
        
    }
    
}
