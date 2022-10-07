package nexon;

public class Q1 {

	public static void main(String[] args) {
  
        int oldWeapons = 4;

        int golds = 8;

        int sellingPrice = 3;

        int repairCost = 4;

        int result = Result123.maxNewWeapons(oldWeapons, golds, sellingPrice, repairCost);

        System.out.println(result);
    }

}

class Result123 {

    public static int maxNewWeapons(int oldWeapons, int golds, int sellingPrice, int repairCost) {
    	
    	int start = 0;
    	int end = oldWeapons;
    	int mid = 0;
    	
    	while(start <= end) {
    		mid = (start+end)/2;
    		System.out.println(mid);
    		long left = (long)(repairCost * mid);
    		long right = (long)(golds + (long)(sellingPrice*(oldWeapons - mid)));
    		
    		
    		if(left == right) {
    			break;
    		}
    		
    		if(left > right) {
    			end = mid - 1;
    		}
    		
    		if(left < right) {
    			if(left + repairCost > right - sellingPrice) {
    				break;
    			}
    			
    			start = mid + 1;
    		}
    	}
    	
//    	long now = golds;
//    	
//    	while(now < (long)(repairCost * oldWeapons)) {
//            now += sellingPrice;
//            oldWeapons--;
//            
//            if(oldWeapons == 0) {
//                break;
//            }
//        }
    	
    	return mid;
    }
}
