public class Dubler {
    public static int[] doubling( int[] arr){
        int[] masx2 = new int[arr.length*2];
        int counter = 0;
        for (int i : arr)
            masx2[counter++]=masx2[counter++]=i;
        return masx2;
    }
}
