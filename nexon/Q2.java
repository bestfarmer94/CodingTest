package nexon;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
  
        ArrayList<Integer> stats = new ArrayList<Integer>();
        stats.add(2);
        stats.add(5);
        stats.add(3);
        stats.add(1);

        int result = Result1234.getStatToDelete(stats);

        System.out.println(result);
    }
}

class Result1234 {

	public static int getStatToDelete(ArrayList<Integer> stats) {
    
		int result = -1;
		
		for(int i=0; i<stats.size(); i++) {
			
			long sum = 0;
			
			for(int j=0; j<i; j++) {
				if(j % 2 == 0) {
					sum += stats.get(j);
				}else {
					sum -= stats.get(j);
				}
			}
			
			for(int j=i+1; j<stats.size(); j++) {
				if(j % 2 == 0) {
					sum -= stats.get(j);
				}else {
					sum += stats.get(j);
				}
			}
			
			if(sum == 0) {
				result = i+1;
				break;
			}
		}
		
        return result;
    }
}