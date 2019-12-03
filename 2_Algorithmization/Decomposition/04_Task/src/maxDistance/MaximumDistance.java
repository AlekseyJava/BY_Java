package maxDistance;

public class MaximumDistance {
    private double distance;
    private double max;
    public double maximim(Integer[][] array, int n){
        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++){
                distance = Math.sqrt((array[j][0] - array[i][0])*(array[j][0] - array[i][0]) +
                        (array[j][1] - array[i][1])*(array[j][1] - array[i][1]));

            }
            if (max < distance){
                max = distance;
            }
        }
        return max;
    }
}
