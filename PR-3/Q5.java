public class Q5 {
    public static void main(String[] args) {
        

        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

          
            int spaces = (5 - i) * 2; 
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

         
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); 
        }
    }
}

    

