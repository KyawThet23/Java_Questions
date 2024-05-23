import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,2,10,8,20,17};
        System.out.println(Arrays.toString(SortArray(array)));
    }

    public static int[] SortArray(int[] array){
        Arrays.sort(array);
        return array;
    }
}
