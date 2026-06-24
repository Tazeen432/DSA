import java.util.HashMap;

public class TwoSumOptimal {

    static void twoSum(int arr[], int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {

            int complement = target - arr[i];

            if(map.containsKey(complement)) {

                System.out.println("Indexes: "
                        + map.get(complement)
                        + " , "
                        + i);
                return;
            }

            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,7,11,15};

        twoSum(arr,9);
    }
}