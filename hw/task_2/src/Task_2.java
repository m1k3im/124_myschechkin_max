public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int ch = 0;
        int ch2 = 0;
        while (ch<= num){
            if (ch*ch <= num){
                ch2 = ch*ch;
            }
            ++ch;
        }
        return ch2;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int p = 1;
        if (num ==0){
            p=1;
        }
        else {

            while (num !=0) {
                p=2*p+6;
                --num;
            }
        }
        return p;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int stepen=base;
        while (stepen<num)
            stepen=stepen*base;
        return stepen == num;

    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1\
        int shechik=0;
        while (start > end){
            if ((start%2 != 0) | (start-end == 2)){
                --start;
                ++shechik;
            }
            else {
                start= start/2;
                ++shechik;
            }
        }
        return shechik;
    }
}
