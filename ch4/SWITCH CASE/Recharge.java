
import java.util.Scanner;

class Recharge {
    public static void main(String[] args) {
        System.out.println("WELCOME TO T-MOBILE");
        System.out.println("Select your language");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. ENGLISH");
        System.out.println("2. HINDI");
        System.out.println("3. GUJARATI");

        int LANG = scanner.nextInt();
        switch (LANG) {
            

            case 1:
                System.out.println("1.Internet Recharge");
                System.out.println("2.Top-up ");
                System.out.println("3.Special recharge");
                int PLAN_1 = scanner.nextInt();
                switch (PLAN_1) {
                    case 1:
                        System.out.println("Select your plan");
                        System.out.println("1-> 29 rs 2 GB data till midnight ");
                        System.out.println("2-> 19 rs 2 G data till midnight");
                        int sel_1 = scanner.nextInt();
                        switch (sel_1) {
                            case 1:
                                System.out.println("Your recharge of 29 rs 2 GB data till midnight is successful.");
                                break;
                            case 2:
                                System.out.println("Your recharge of 19 rs 2 G data till midnight is successful.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }

                        break;
                    case 2:
                        System.out.println("Select your plan");
                        System.out.println("1-> 299rs 2GB/day and unlimited calls for 28 days");
                        System.out.println("2-> 599rs 2 GB299rs 2GB/day and unlimited calls for 84 days");
                        int sel_2 = scanner.nextInt();
                        switch (sel_2) {
                            case 1:
                                System.out.println(
                                        "Your recharge of 299 rs 2GB/day and unlimited calls for 28 days is successful.");
                                break;
                            case 2:
                                System.out.println(
                                        "Your recharge of 599 rs 2GB/day and unlimited calls for 84 days is successful.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }
                        break;
                    case 3:
                        System.out.println("Select your plan");
                        System.out.println("1-> 10 rs for 7 rs talktime");
                        System.out.println("2-> 100 rs for 75 rs talktime");
                        int sel_3 = scanner.nextInt();
                        switch (sel_3) {
                            case 1:
                                System.out.println("Your recharge of 10 rs for 7 rs talktime is successful.");
                                break;
                            case 2:
                                System.out.println("Your recharge of 100 rs for 75 rs talktime is successful.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }
                        break;
                    default:
                        System.out.println("INVALIDCHOICE");
                }

                break;
            case 2:

                System.out.println("1.Internet Recharge");
                System.out.println("2.Top-up ");
                System.out.println("3.Special recharge");
                int PLAN_2 = scanner.nextInt();
                switch (PLAN_2) {
                    case 1:

                        System.out.println("aapka plan select kijiye");
                        System.out.println("1-> 29 rs 2 GB data raat tak ");
                        System.out.println("2-> 19rs 2 GBdata raat tak");
                        int select_1 = scanner.nextInt();
                        switch (select_1) {
                            case 1:

                                switch (select_1) {
                                    case 1:
                                        System.out.println("aapka recharge hogaya 29 rs 2 GB");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            case 2:

                                switch (select_1) {
                                    case 1:
                                        System.out.println("aapka recharge hogaya 19 rs 2 GB");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            default:
                                System.out.println("INVALIDCHOICE");
                        }
                        break;
                    case 2:

                        System.out.println("aapka plan select kijiye");
                        System.out.println("1->299rs 2GB/day aur unlimited calls 28din tak");
                        System.out.println("2->599rs 2 GB299rs 2GB/day aur unlimited calls 84din tak");
                        int select_2 = scanner.nextInt();
                        switch (select_2) {
                            case 1:

                                switch (select_2) {
                                    case 1:
                                        System.out.println(
                                                "aapka recharge hogaya 299rs 2GB/day aur unlimited calls 28din tak");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            case 2:

                                switch (select_2) {
                                    case 1:
                                        System.out.println(
                                                "aapka recharge hogaya 599rs 2 GB299rs 2GB/day aur unlimited calls 84din tak");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            default:
                                System.out.println("INVALIDCHOICE");
                        }
                        break;
                    case 3:

                        System.out.println("aapka plan select kijiye");
                        System.out.println("1-> 10rs pe 7rs talktime");
                        System.out.println("2-> 100rs pe 75rs talktime");
                        int select_3 = scanner.nextInt();
                        switch (select_3) {
                            case 1:

                                switch (select_3) {
                                    case 1:
                                        System.out.println("aapka recharge hogaya 10rs 7 rs talktime");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            case 2:

                                switch (select_3) {
                                    case 1:
                                        System.out.println("aapka recharge hogaya 100rs pe 75rs talktime");
                                        break;
                                    default:
                                        System.out.println("INVALIDCHOICE");
                                }
                                break;
                            default:
                                System.out.println("INVALIDCHOICE");
                        }
                        break;

                    default:
                        System.out.println("INVALIDCHOICE");
                }

                break;
            case 3:
               System.out.println("1.Internet Recharge");
                System.out.println("2.Top-up ");
                System.out.println("3.Special recharge");
                int PLAN_5 = scanner.nextInt();
                switch (PLAN_5) {
                    case 1:
                        System.out.println(" plan select karo");
                        System.out.println("1-> 29 rs 2 GB data 1 divas mate");
                        System.out.println("2-> 19 rs 2 G data 1 divas mate");
                        int sel_1 = scanner.nextInt();
                        switch (sel_1) {
                            case 1:
                                System.out.println("tamaru 29 rs 2 GB data 1 divas mate safalta purvak thi gayu.");
                                break;
                            case 2:
                                System.out.println("tamaru 19 rs 2 G data 1 divas mate safalta purvak thi gayu.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }

                        break;
                    case 2:
                        System.out.println(" plan select karo");
                        System.out.println("1-> 299rs 2GB/day aane unlimited calls for 28 days mate");
                        System.out.println("2-> 599rs 2GB/day aane unlimited calls for 84 days mate");
                        int sel_2 = scanner.nextInt();
                        switch (sel_2) {
                            case 1:
                                System.out.println(
                                        "tamaru 299 rs 2GB/day aane unlimited calls for 28 days mate safalta purvak thi gayu.");
                                break;
                            case 2:
                                System.out.println(
                                        "tamaru 599 rs 2GB/day aane unlimited calls for 84 days mate safalta purvak thi gayu.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }
                        break;
                    case 3:
                        System.out.println(" plan select karo");
                        System.out.println("1-> 10 rs for 7 rs talktime");
                        System.out.println("2-> 100 rs for 75 rs talktime");
                        int sel_3 = scanner.nextInt();
                        switch (sel_3) {
                            case 1:
                                System.out.println("tamaru 10 rs aane 7 rs talktime mate safalta purvak thi gayu.");
                                break;
                            case 2:
                                System.out.println("tamaru 100 rs aane 75 rs talktime mate safalta purvak thi gayu.");
                                break;
                            default:
                                System.out.println("INVALID CHOICE");
                        }
                        break;
                    default:
                        System.out.println("INVALIDCHOICE");
            


        }

    }
    }
}