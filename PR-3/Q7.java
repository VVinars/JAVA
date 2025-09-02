public class Q7 {


    public static void main(String[] args) {
        

        

        for (int i = 0; i < 5; i++) {
          
            System.out.print("*");

        
            if (i == 0 || i == 2) {
                for (int j = 0; j < 5 - 1; j++) {
                    System.out.print("*");
                }
            } 
            
            else if (i < 2) {
                for (int j = 0; j < 5 - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
          
            else {
                for (int j = 0; j < 5 - 1; j++) {
                    System.out.print(" ");
                }
            }

            
            System.out.println();
        }
    }
}

    

