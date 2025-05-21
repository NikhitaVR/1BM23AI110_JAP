class LeastBalanceException extends Exception{
    public String getmessage = "the withdrawal is not possible";

    public  void LeastBalanceException(double amount){
        System.out.println("the withdrawal of "+amount+"is not possible");
    }
}
public class giftcard{
    public giftcard() {
    }

    public void Giftcard(){
        final int min_balance = 500;
        int balance ;

    }
    public static void balance(){
        int[] balance = new int[500];
    }
    public static void addgiftcard(int amount){
        int balance = 500;
        balance = balance +amount;
        System.out.println("The fund in gift card after adding amount is "+balance);
    }
    public static void spendgiftcard(int amount)throws LeastBalanceException{
        int balance = 500;
        balance = balance -amount;
        if(balance<500){
            throw new LeastBalanceException();
        }
        System.out.println("The fund in gift card after withdrawal is "+balance);
    }
    public static void main(String args[]){
        giftcard obj = new giftcard();
        obj.addgiftcard(1000);
        obj.balance();
        try{
            obj.spendgiftcard(100);
        }
        catch(LeastBalanceException e){
            System.out.println(" LeastBalanceException : "+e.getmessage);
        }
    }
}