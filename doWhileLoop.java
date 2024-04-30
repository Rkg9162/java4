public class doWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("*");
            i++;
        }
        while(i>5);
        // 1 star print because condition is false 
        System.out.println("below second statement");
        do{
            System.out.println("*");
            i++;
        }
        while(i<5);
        //5 star print vecarse condition is true 
        


    }
    
}
