public class ContainerWithMostWaterBrute {

    static int maxArea(int arr[]) {

        int max = 0;

        for(int i=0;i<arr.length;i++) {

            for(int j=i+1;j<arr.length;j++) {

                int area = Math.min(arr[i],arr[j]) * (j-i);

                if(area > max)
                    max = area;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }
}