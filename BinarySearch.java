public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,20,43};
        int keyIndex = binarySearch(array,43);
        System.out.println("Key found at index "+keyIndex);
    }

    public static int binarySearch(int[] array,int key){

        int start = 0;
        int end = array.length -1;
        int mid =  (start+end)/2;

        while (start <= end){

            if(array[mid] == key){
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid =  (start+end)/2;
        }

        return 1;
    }
}
