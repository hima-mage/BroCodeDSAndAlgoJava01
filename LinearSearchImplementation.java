public class LinearSearchImplementation {

    public static void main(String[] args) {

        int[] array = {1, 3,6,78,1,23,6};

        int index = linearSearch(array, 6);

        System.out.println(index);
    }

    /***
     * iterate each array element , one element each time
     * @param array
     * @param val
     * @return
     */
    private static int linearSearch(int[] array, int val) {

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == val){
                return i;
            }
        }
        return -1;
    }
}
