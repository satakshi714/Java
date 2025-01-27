import java.util.*;
class BankAccount{
    private int accNo;
    private int balance;
    private String name;

    public int getAccNo(){
        return accNo;
    }

    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    
    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        if(balance > 0)
            this.balance = balance;
        else{
            System.out.println("Balance Empty");
            this.balance = 0;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

public class EncapsulationBankDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int accNo = sc.nextInt();
        int balance = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        BankAccount bc = new BankAccount();
        bc.setAccNo(accNo);
        bc.setBalance(balance);
        bc.setName(name);
        System.out.println("Name: "+ name +", Account No.: "+ accNo+", Balance: "+ bc.getBalance());
    }
}