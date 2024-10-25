public class Lottery {
    private int lotteryNumber;


    public Lottery(){
        lotteryNumber = (int)(Math.random()*100);

    }

    public int determineWinnings(int userNumber){
        if(userNumber == lotteryNumber){
            return 100;
        }
        else if((userNumber%10) == (lotteryNumber/10) && (userNumber/10) == (lotteryNumber%10)){
            return 10;
        }
        else if((userNumber%10) == (lotteryNumber/10)){
            return 3;
        }
        else if((userNumber/10) == (lotteryNumber%10) && userNumber > 10){
            return 3;
        }
        else if((userNumber%10) == (lotteryNumber%10)){
            return 3;
        }
        else if((userNumber/10) == (lotteryNumber/10) && userNumber > 10){
            return 3;
        }
        else{
            return 0;
        }

    }
    public void displayLottery(){
        System.out.println("The lottery number is " + lotteryNumber);
    }
    public void displayWinnings(int money){
        if(money == 100){
            System.out.println("Exact match:  You win $100!");
        }
        else if(money == 10){
            System.out.println("Match all digits but not in correct order:  You win $10!");
        }
        else if(money == 3){
            System.out.println("Match one digit: you win $3!");
        }
        else {
            System.out.println("No matching numbers, you win nothing :(");
        }
    }

}
