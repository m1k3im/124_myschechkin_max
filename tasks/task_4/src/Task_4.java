public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int[] arraymas = new int[size];
        arraymas[0]= a0;
        for(int i=1;i< arraymas.length;++i){
            arraymas[i]=arraymas[i-1]+d;
        }
        return arraymas;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int arry[] = new int[size];
        int summ = 2;
        for(int i = 0; i < size; i++)
        {
            if (i <= 1) {
                arry[i] = 1;
            }
            else {
                arry[i] = summ;
                summ = summ + arry[i];
            }
        }
        return arry;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int[] buffar = new int[size];
        for(int i=0;i<buffar.length;++i){
            if (i==0){
                buffar[0]=0;
            }
            else {
                if(i==1){
                    buffar[1]=1;
                }
            else{
                buffar[i]=buffar[i-1]+buffar[i-2];
              }
            }
        }
        return buffar;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max =data[0];
        for(int i=0;i< data.length;++i){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max = Integer.MIN_VALUE;
        for(int i=0;i< data.length;++i){

            if(data[i]%k==0){

                if(data[i]>max & data[i]%k==0){
                    max=data[i];
                }

            }

        }

        return max;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        int[] newarr = new int [arr1.length+ arr2.length];
        for(int i =0;i<arr1.length;++i){
            newarr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;++i){
            newarr[i+arr1.length]=arr2[i];
        }
        java.util.Arrays.sort(newarr);
        return newarr;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        int[] newarr = new int [arr1.length+ arr2.length];
        for(int i =0;i<arr1.length;++i){
            newarr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;++i){
            newarr[i+arr1.length]=arr2[i];
        }
        java.util.Arrays.sort(newarr);
        return newarr;

    }
}
