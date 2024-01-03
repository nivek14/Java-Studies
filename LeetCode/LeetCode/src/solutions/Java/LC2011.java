package solutions.Java;

public class LC2011 {

    public int finalValueAfterOperations(String[] operations) {

        int count = 0;

        for(String operation : operations) {
            switch (operation){
                case "--X":
                case "X--":
                    count--;
                    break;
                case "++X":
                case "X++":
                    count++;
                    break;
                default:
                    break;
            }
        }

        return count;

    }

}
