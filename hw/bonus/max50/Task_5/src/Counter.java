import java.util.HashMap;

public class Counter {
    public HashMap<Integer,Integer> count(int[]a){
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int i = 0; i<a.length;i++){
            if(maps.containsKey(a[i])){
                int counte = maps.get(a[i])+1;
                maps.put(a[i],counte);
            }
            else{ maps.put(a[i],1); }
        }
        return maps;
    }
}