public class Q6 {
    
    public static void main(String[] args) {
       
        

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int num = 5 - i + 1; num <= 5; num++) {
                System.out.print(num);
            }

            for (int num = 5 - 1; num >= 5 - i + 1; num--) {
                System.out.print(num);
            }

            System.out.println(); 
        }
    }
}

    


    

