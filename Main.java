import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;

        System.out.println("Internetbanka!");

        while (true) {
            System.out.print("\nIzvēlies darbību (1 => pievienot, 2 => izņemt, 3 => balanss, 4 => iziet): ");
            String cmd = sc.nextLine();

            if (cmd.equals("4")) {
                break;
            }

            switch (cmd) {
                case "1":
                    System.out.print("\nIevadiet pievienojamo summu: ");
                    double dep = Double.parseDouble(sc.nextLine());
                    if (dep < 0) {
                        System.out.println("\nSummai jābūt pozitīvai");
                    } else {
                        balance += dep;
                    }
                    break;
                case "2":
                    System.out.print("\nIevadiet izņemto summu: ");
                    double wit = Double.parseDouble(sc.nextLine());
                    if (wit < 0) {
                        System.out.println("\nSummai jābūt pozitīvai");
                    } else if (wit > balance) {
                        System.out.println("\nNepietiekami līdzekļi");
                    } else {
                        balance -= wit;
                    }
                    break;
                case "3":
                    System.out.print("Konta balanss: " + balance);
                    break;
                case "4":
                    System.out.print("Visu labu!");
                    break;
                default:
                    System.out.print("Nederīga komanda!");
            }
        }
    }
}
