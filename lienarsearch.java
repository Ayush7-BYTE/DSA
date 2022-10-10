class Solution {
		public int singleNonDuplicate(int[] nums) {
			if( nums.length==1 ) return nums[0] ;
			for( int i=0;i<nums.length; ) {
				if( i<nums.length-1 && nums[i]==nums[i+1] )
					i +=2 ;
				else return nums[i] ;
			}   
			return 0 ;
		}
	}
