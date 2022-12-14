public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int Count = 0;

        if (n1 < n2) {
            for (int i = n1; i <= n2; ++i) {
                if (i % a == 0 & i % b != 0) {
                    ++Count;
                }

            }
        } else {
            for (int i = n2; i <= n1; ++i) {
                if (i % a == 0 & i % b != 0) {
                    ++Count;
                }
            }

        }
        return Count;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int ch = 0;
        int ch2 = 1;
        for (int i = 0; i <= num; ++i) {
            ++ch;
            for (int j = 0; j < ch2; ++j)
                ++i;
            ++ch2;
        }
        return ch;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int a = num;
        int sled = 0;
        int sumka = 0;
        for (int i = 0; i < cnt; ++i) {
            if (i == 0) {
                sumka += a;
            } else {
                sled = a;
                a = sled * d + 1;
                sumka += a;

            }

        }
        return sumka;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int summ = 0;

        for (int i = 1; i <= n; ++i) {
            summ += factorial(i);
        }


        return summ;
    }

    public static int factorial(int n) {
        int factoria = 1;
        for (int i = 1; i <= n; ++i) {
            factoria *= i;
        }

        return factoria;
    }
}
