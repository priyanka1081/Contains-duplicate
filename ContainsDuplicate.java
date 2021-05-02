package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		boolean status= false;
		int count=0;
		
		Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length; i++) {
			if(!mp.containsKey(nums[i])) {
				count=0;
				mp.put(nums[i], count);
			}else {
				return true;
			}
		}
		
		return status;
	}

	public static void main(String[] args) {
		ContainsDuplicate cd= new ContainsDuplicate();
		int[] nums= {1,3,4,2};
		System.out.println(cd.containsDuplicate(nums));
	}

}
