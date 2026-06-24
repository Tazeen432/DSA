import java.util.HashSet;

public class ContainsDuplicateOptimal {

    static boolean containsDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++) {

            if(set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,1};

        System.out.println(containsDuplicate(arr));
    }
}