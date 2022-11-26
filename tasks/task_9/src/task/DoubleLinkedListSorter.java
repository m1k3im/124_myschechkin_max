package task;

public class DoubleLinkedListSorter {
    public static <T extends Comparable<T>> void sort(DoubleLinkedList<T> arr) {
        int SortedEls = 0;
        if (arr.getSize() == 0)
            return;
        while (SortedEls != arr.getSize() - 1) {
            var ShardEl = arr.getFirst();
            for (int i = 0; i < arr.getSize() - SortedEls - 1; ++i) {
                if (ShardEl.getData().compareTo(ShardEl.getNext().getData()) >=0){
                    var data = ShardEl.getData();
                    ShardEl.setData(ShardEl.getNext().getData());
                    ShardEl.getNext().setData(data);
                }
                ShardEl = ShardEl.getNext();
            }
            ++SortedEls;
        }
    }
}
