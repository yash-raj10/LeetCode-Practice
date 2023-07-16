class Solution {
    public int findNumbers(int[] nums) {
         return findEven(nums);
    }

    static int findEven(int[]aoo){
        int count = 0;
        for (int i =0; i < aoo.length; i++){
            if(even(aoo[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int i) {
        int count2 = 0;
        while(i>0){
            count2++;
            i = i/10;

        }
        System.out.println(count2);
        int x = count2;
        if(x%2==0){
            return true;
        }

        return false;
    }
}
