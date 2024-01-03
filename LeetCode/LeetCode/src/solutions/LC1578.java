package solutions;

public class LC1578 {

    public int minCost(String colors, int[] neededTime) {

        int totalTime = 0;

        // tem que ter dois laços, um com o caracter atual e outro comparando com os próximos caracteres até aparecer algo diferente
        for(int i = 0; i < colors.length(); i++){
            if(i + 1 == colors.length()) break;
            for(int j = i+1; j < colors.length(); j++){
                if(colors.charAt(i) == colors.charAt(j)){
                    if(neededTime[i] < neededTime[j]){
                        totalTime += neededTime[i];
                    }
                    else totalTime += neededTime[j];
                }
            }
        }

        return totalTime;

    }

}
