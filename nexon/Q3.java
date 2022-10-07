package nexon;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		
		String adventures = "bcaa";
		int k = 3;
		int result = Result.getMaximumCombatPower(adventures, k);
		System.out.println(result);

	}
}

class Result {
	
    public static int getMaximumCombatPower(String adventures, int k) {
    
        int max = Integer.MIN_VALUE;
        int[] alpha = new int[27];
        
        for(int i=0; i<adventures.length()-k+1; i++){
            String str = adventures.substring(i, k+i);
            Arrays.fill(alpha, 0);
            for(int j=0; j<k; j++){
                alpha[str.charAt(j) - 'a' + 1]++;
            }
            
            long result = 0;
            for(int j=1; j<alpha.length; j++){
            	if(alpha[j] != 0) {
            		int part = j;
            		for(int l=1; l<alpha[j]; l++) {
            			part *= j;
            			part %= Math.pow(10, 10);
            		}
            		result += part;
            	}
            }
            
            result %= (Math.pow(10, 9) + 7);
            if(result > max){
                max = (int)result;
            }
        }
        
        return max;
    }

}