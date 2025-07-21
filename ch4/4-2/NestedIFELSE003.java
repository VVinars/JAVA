import java.util.Scanner;

class NestedIFELSE003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value\t:");
        int a = scanner.nextInt();
        System.out.print("Enter second value\t:");
        int b = scanner.nextInt();
        System.out.print("Enter third value\t:");
        int c = scanner.nextInt();
        System.out.print("Enter fourth value\t:");
        int d = scanner.nextInt();
        System.out.print("Enter fourth value\t:");
        int e = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    if (a > e) {
                        System.out.println("First number is the maximum ");
                    } else {
                        System.out.println("Fifth number is the maximum");
                    }
                } else {
                    if (d > e) {
                        System.out.println("Fourth number is the maximum:");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        System.out.println("Third number is the maximum ");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                } else {
                    if (d > e) {
                        System.out.println("Fourth number is the maximum:");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    if (b > e) {
                        System.out.println("Second number is the maximum:");
                    } else {
                        System.out.println("Fifth number is the maximum");
                    }
                } else {
                    if (d > e) {
                        System.out.println("Fourth number is the maximum ");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        System.out.println("Third number is the maximum ");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                } else {
                    if (d > e) {
                        System.out.println("Fourth number is the maximum ");
                    } else {
                        System.out.println("Fifth number is the maximum ");
                    }
                }
            }
        }

        scanner.close();
    }

}
