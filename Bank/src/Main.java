import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static class Client{
        String name;
        double ballance;
        String password;
        Client(String word, double money){
            this.name=word;
            this.ballance=money;
        }
        {
            this.password="default";
        }

        public void changep(){
            System.out.println("current pass");
            String curpass=in.nextLine();
            if (curpass.equals(this.password)){
            System.out.println("new pass");
            this.password=in.nextLine();
                System.out.println(this.password);}
                else {System.out.println("wrong pass");
               }
        }
    }
    public static boolean checkmoney(Client n) {
        if (n.ballance > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkpass(Client person, String pas){
        if(person.password.equals(pas)){
            return true;
        }
        else {return false;}
    }
    public static class bank {
        void sendMoney(Client fromClient, String pass, Client toClient, double amount) {
            if (checkpass(fromClient, pass) && (checkmoney(fromClient)) && (fromClient.ballance >= amount)) {

                toClient.ballance = toClient.ballance + amount;
                fromClient.ballance = fromClient.ballance - amount;
                System.out.println("success");
            } else {
                System.out.println("wrong password or not enouph money");
            }


        }
    }


    public static void main(String[] args) {
        Client A=new Client("A",1000);
        Client B=new Client("B",0);
        Client C=new Client("C",200);
        bank BANK=new bank();
        BANK.sendMoney(A,"default",B,300);
        System.out.println(B.ballance);
        System.out.println(A.ballance);
        B.changep();
        BANK.sendMoney(B,"new",A,300);
        BANK.sendMoney(C,"default",A,300);
        System.out.println(B.ballance);
        System.out.println(A.ballance);
        System.out.println(C.ballance);





    }
}