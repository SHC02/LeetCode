import java.util.HashMap;
import java.util.Map;
	/*  Input: nums = [2,7,11,15], target = 9

			 [2,7,11,15]     {}
			  ^
				9 - 2 = 7

			 [2,7,11,15]     {2:0}
				^
				9 - 7 = 2           

		Output: [0,1]

		ALGORITHM
			STEP 1: create a map to store seen key:element val:index
			STEP 2: loop over all the elements in the array
				STEP 3: find the complement TARGET - NUMS[i]
				STEP 4: if you have seen the complement 
						-> return [index of complement, index of current element]
				STEP 5: add the current element with the current element index
			STEP 6: return [-1,-1] if the element was not found     

	*/
public class twoSum {
    
    public int[] twoSum(int[] nums, int target)
    {
        // Create a hashmap to store seen key:element val:index
        Map<Integer, Integer> map = new HashMap<>();
        
        // loop over all the elements in the array
        for(int i = 0; i < nums.length; i++)
        {
            // find the complement (target - nums[i])
            int complement = target - nums[i];

            // if you have seen the complement
            if(map.containsKey(complement))
            {
                //return [index of complement, index of current element]
                return new int[]
                {
                    map.get(complement), i
                };
            }
            // add the current element with the current element index
            map.put(nums[i], i);
        }
        
        // return [-1,1] if the element was not found
        return new int[]{
            -1,1
        };
    }
}
