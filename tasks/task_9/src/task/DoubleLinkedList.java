package task;

import java.awt.*;
import java.util.function.DoubleToIntFunction;

public class DoubleLinkedList<T extends Comparable<T>> {
    /*
     ------------------------------------------------------------------------------------------
     *   Конструктор: не принимает аргументов
     *   Методы:
     *       findFirstItem    - возвращает первый элемент с указанным значением
     *       findLastItem     - возвращает первый элемент с указанным значением
     *       insertAfter      - размещает элемент с указанным ЗНАЧЕНИЕМ после заданного.
     *  						Первым аргументом идет элемент списка, вторым данные.
     *       insertBefore     - размещает элемент с указанным ЗНАЧЕНИЕМ перед заданным
     *  						Первым аргументом идет элемент списка, вторым данные.
     *       remove           - удаляет переданный элемент из списка
     *       getSize          - возвращает размер списка
     *       getFirst         - возвращает первый элемент списка
     *       getLast          - возвращает последний элемент списка
     *   Дополнение:
     *       - generic параметр должен быть сравниваемым
     * ------------------------------------------------------------------------------------------
     */
    private DoubleLinkedListItem<T> ZeroEl;
    private DoubleLinkedListItem<T> LastEl;
    private int Storage;



    public DoubleLinkedList(){
        ZeroEl=LastEl=null;
        Storage=0;
    }


    public DoubleLinkedListItem<T> findFirstItem(T value) {
        if(Storage == 0)
            return null;
        var ShardEl = ZeroEl;
        while (ShardEl != null && !ShardEl.getData().equals(value))
            ShardEl = ShardEl.getNext();
        return ShardEl;
    }
    public DoubleLinkedListItem<T> findLastItem(T value) {
        if(Storage == 0)
            return null;
        var ShardEl = LastEl;
        while (ShardEl != null && !ShardEl.getData().equals(value))
            ShardEl = ShardEl.getPrev();
        return ShardEl;
    }
    public void insertAfter(DoubleLinkedListItem<T> listItem, T data) {
        if(Storage == 0) {
            ZeroEl = LastEl = new DoubleLinkedListItem<>(data);
            ++Storage;
            return;
        }
        var item = new DoubleLinkedListItem<>(data);
        if(listItem == null) {
            item.setNext(ZeroEl);
            ZeroEl.setPrev(item);
            ZeroEl = item;
        }
        else if(listItem == LastEl) {
            LastEl.setNext(item);
            item.setPrev(LastEl);
            LastEl = item;
        }
        else {
            item.setPrev(listItem);
            item.setNext(listItem.getNext());
            listItem.getNext().setPrev(item);
            listItem.setNext(item);
        }
        ++Storage;
    }
    public void insertBefore(DoubleLinkedListItem<T> listItem, T data) {
        if(Storage == 0) {
            ZeroEl = LastEl = new DoubleLinkedListItem<>(data);
            ++Storage;
            return;
        }
        var item = new DoubleLinkedListItem<>(data);
        if(listItem == null) {
            LastEl.setNext(item);
            item.setPrev(LastEl);
            LastEl = item;
        }
        else if(listItem == ZeroEl) {
            item.setNext(ZeroEl);
            ZeroEl.setPrev(item);
            ZeroEl = item;
        }
        else {
            item.setNext(listItem);
            item.setPrev(listItem.getPrev());
            listItem.getPrev().setNext(item);
            listItem.setPrev(item);
        }
        ++Storage;
    }

    public void remove(DoubleLinkedListItem<T> item) {
        if(Storage == 1) {
            ZeroEl = LastEl = null;
        }
        else if(item == ZeroEl) {
            item.getNext().setPrev(null);
            ZeroEl = item.getNext();
        }
        else if(item == LastEl) {
            item.getPrev().setNext(null);
            LastEl = item.getPrev();
        } else {
            item.getNext().setPrev(item.getPrev());
            item.getPrev().setNext(item.getNext());
        }
        --Storage;
    }

    public int getSize() {
        return Storage;
    }
    public DoubleLinkedListItem<T> getFirst() {
        return ZeroEl;
    }
    public DoubleLinkedListItem<T> getLast() {
        return LastEl;
    }
}
