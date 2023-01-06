package task;

public class DoubleLinkedListItem<T extends  Comparable<T>> {

    /*
     *   Конструктор: принимающий аргумент данных generic типа
     *   Методы:
     *       getNext - возвращает ссылку на следующий элемент
     *       getPrev - возвращает ссылку на предыдущий элемент
     *       getData - возвращает ссылку на объект данных
     *       setNext - устанавливает ссылку на следующий элемент
     *       setPrev - устанавливает ссылку на предыдущий элемент
     *       setData - устанавливает ссылку на элемент данных
     *   Дополнение:
     *       - generic параметр должэен быть сравниваемым
     * ------------------------------------------------------------------------------------------
     */
    private DoubleLinkedListItem<T> Before_Curr;
    private DoubleLinkedListItem<T> After_Curr;
    private T data;



    public DoubleLinkedListItem(T data) {
        Before_Curr = After_Curr = null;
        this.data = data;
    }


    public DoubleLinkedListItem<T> getNext() {
        return After_Curr;
    }
    public DoubleLinkedListItem<T> getPrev() {
        return Before_Curr;
    }
    public T getData() {
        return data;
    }



    public void setNext(DoubleLinkedListItem<T> value) {
        After_Curr = value;
    }
    public void setPrev(DoubleLinkedListItem<T> value) {
        Before_Curr = value;
    }
    public void setData(T value) {
        data = value;
    }
}
