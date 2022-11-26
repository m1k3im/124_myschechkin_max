import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> refreshed = new ArrayList<>();
        for(Integer i : data){
            if(i %k==0 & i%n!=0){
                refreshed.add(i);
            }
        }
        return refreshed;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> newarray = new ArrayList<>();
        int ch = 0;
        for (int i = 1; i <= size; ++i){
            ch = 0;
            if (newarray.size() < size)
                while (ch < i && newarray.size() < size){
                    newarray.add(i);
                    ++ch;
                } else break;
        }
        return newarray;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> intersect = new HashSet<Integer>(s1);
        intersect.retainAll(s2);
        return intersect;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        HashSet<Integer> onion = new HashSet<>(s1);
        onion.addAll(s2);
        return onion;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> raznica = new HashSet<>(s1);
        raznica.addAll(s2);
        raznica.removeAll(s1);
        return raznica;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> difference = new HashSet<>();
        for(Integer i : s1) {
            if (!s2.contains(i))  difference.add(i);
        }
        for(Integer i : s2) {
            if (!s1.contains(i))  difference.add(i);
        }
        return difference;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
		return null;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        return null;
    }
}
