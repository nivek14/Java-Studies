package solutions.Java;

public class LC1672 {

    public int maximumWealth(int[][] accounts) {

        int currentAccount = 0;
        int biggestAccount = 0;

       for(int i = 0; i < accounts.length; i++){
           for(int j = 0; j < accounts[i].length; j++){
               currentAccount += accounts[i][j];
               if(currentAccount > biggestAccount) biggestAccount = currentAccount;
           }
           currentAccount = 0;
       }

        return biggestAccount;

    }

}