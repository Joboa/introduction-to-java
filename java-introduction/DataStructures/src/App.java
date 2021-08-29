import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(89);

        int[] ids = new int[10];
        System.out.println(ids[0]);
        System.out.println(ids.length);

        String[] instruments = new String[]{"guitar","drums","bass"};
        Arrays.sort(instruments);
        System.out.println(Arrays.toString(instruments)); 
        // System.out.println(instruments);
    }
}
