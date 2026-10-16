import java.util.Arrays;

public class bubble_Sort {
    public static void main(String[] args) {
        int[] query = {1, 4, 5, 6, 10, 8, 7, 3, 1000000, 7777};
        for (int i = 0; i < query.length; i++){
            for (int j = i + 1; j < query.length; j++){
                if (query[j] < query[i]){
                    int mid = 0;
                    mid = query[i];
                    query[i] = query[j];
                    query[j] = mid;
                }
            }
        }
        System.out.println(Arrays.toString(query));

    }
    
}
