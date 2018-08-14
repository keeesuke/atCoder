import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        // Mapの宣言
        Map<Integer, String> mMap = new HashMap<Integer, String>();

        // Mapにデータを格納
        mMap.put( 3, "apple");
        mMap.put( 3, "orange");
        mMap.put( 1, "pineapple");
        mMap.put( 6, "strawberry");
        mMap.put( 1, "melon");

        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);

        for (Integer nKey : mMap.keySet())
        {
            System.out.println(mMap.get(nKey));
        }
    }

}
