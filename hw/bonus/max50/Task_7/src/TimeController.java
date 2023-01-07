import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public final class TimeController {
    public static int max_time_lesson(ArrayList<String> LessonsList, ArrayList<Integer> Wasted_time) {
        Map<String, Integer> LessonsMap = new HashMap<>();
        for (int j = 0; j < LessonsList.size(); j++) {
            final int a = j;
            LessonsMap.putIfAbsent(LessonsList.get(j), 0);
            LessonsMap.computeIfPresent(LessonsList.get(j), (key, oldValue) -> oldValue + Wasted_time.get(a) );
        }
        return Collections.max(LessonsMap.entrySet(), Map.Entry.comparingByValue() ).getValue();
    }
}
