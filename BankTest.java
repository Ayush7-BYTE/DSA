import java.util.*;
class Banking {
    public static void main(String[] args) {
        deposit d = new deposit();
        d.getdata();
        d.interest();
        d.putdata();
        savings s = new savings();
        s.getdata();
        s.RD();
        s.showrd();
    }

}
class deposit {
    String cname;
    int accno;
    double balance = 10000;
    double intr = 0;
    void getdata(){
        System.out.println("Enter the customer name: ");
        Scanner scan = new Scanner(System.in);
        cname = scan.nextLine();
        System.out.println("Enter the account number: ");
        accno = scan.nextInt();
        scan.close();
    }
    void putdata(){
        System.out.println("Customer name: "+cname);
        System.out.println("Account number: "+accno);
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+intr);
    }
    void interest(){
        System.out.println("Enter the total time: ");
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        sc.close();
        intr = balance * 4.0 * yr;
    }
}
class savings extends deposit{
    void showrd(){
        System.out.println("Customer name: " + cname);
        System.out.println("Account number: " + accno);
        System.out.println("Interest: " + intr);
    }
    void RD(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of years in RD: ");
        int yr = s.nextInt();
        intr = balance * 6.5 * yr;
        s.close();
    }
}