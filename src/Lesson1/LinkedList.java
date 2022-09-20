/*
2.1. Опишите АТД LinkedList с предложенным набором операций.
Разделите операции на запросы и команды.
Добавьте где необходимо предусловия и постусловия.
Добавьте запросы статуса команд, для работы которых требуются предусловия (учитывайте в частности случаи, когда список пустой).

2.2. Почему операция tail не сводима к другим операциям (если исходить из эффективной реализации)?

2.3. Операция поиска всех узлов с заданным значением, выдающая список таких узлов, уже не нужна. Почему?
 */
public class LinkedList {
    class Node {}

    // Статусы
    int HEAD_STATUS;
    int TAIL_STATUS;
    int RIGHT_STATUS;
    int PUT_RIGHT_STATUS;
    int PUT_LEFT_STATUS;
    int REMOVE_STATUS;
    int REPLACE_STATUS;
    int FIND_STATUS;
    int GET_STATUS;

    // Конструктор:
    // постусловие: создан новый пустой список
    public LinkedList<T> LinkedList();

    /******************************************************************************************
     * Команды:
     */
    // предусловие: список не пустой
    // постусловие: курсор указывает на первый элемент списка
    public void head() { }

    // предусловие: список не пустой
    // постусловие: курсор указывает последний элемент списка
    public void tail() { }

    // предусловие: справа есть элемент
    // постусловие: курсор сдвинут на один узел вправо
    public void right() { }

    // предусловие: список не пуст;
// постусловие: перед текущим узлом новый узел с заданным значением
    public void putLeft(Node item) { }

    // предусловие: список не пуст;
    // постусловие: следом за текущим узлом новый узел с заданным значением
    public void putRight(Node item) { }

    // постусловие: в конце списка появляется новый элемент
    public void addTail(Node item) { }

    // предусловие: список не пуст;
    // постусловие: значение текущего узла заменено на новое
    public void replace(Node item) { }

    // предусловие: список не пуст;
    // постусловие: текущий узел удалён, курсор смещается к правому соседу, если он есть,
    //              в противном случае курсор смещается к левому соседу, если он есть
    public void remove() { }

    // постусловие: в списке отсутствуют элементы равные item
    public void removeAll(Node item) { }

    // постусловие: список пуст
    public void clear() { }

    // постусловие: курсор установлен на следующий узел
    //              с искомым значением, если такой узел найден
    public void find(Node item) { }

    /***************************************************************************************
     * Запросы:
     */
    public void get(Node item) { }

    public boolean isHead() { }

    public boolean isTail() { }

    public boolean isValue() { }

    public int size() { }

    /***************************************************************************************
     * Запросы статусов:
     */
    // успешно; список пуст
    public int getHeadStatus() {
        return HEAD_STATUS;
    }

    // успешно; список пуст
    public int getTailStatus() {
        return TAIL_STATUS;
    }

    // успешно; справа нет элемента
    public int getRightStatus() {
        return RIGHT_STATUS;
    }

    // успешно; список пуст
    public int getPutRightStatus() {
        return PUT_RIGHT_STATUS;
    }

    // успешно; список пуст
    public int getPutLeftStatus() {
        return PUT_LEFT_STATUS;
    }

    // успешно; список пуст
    public int getRemoveStatus() {
        return REMOVE_STATUS;
    }

    // успешно; список пуст
    public int getReplaceStatus() {
        return REPLACE_STATUS;
    }

    // элемент найден; элемент не найден; список пуст
    public int getFindStatus() {
        return FIND_STATUS;
    }

    // успешно; список пуст
    public int getGetStatus() {
        return GET_STATUS;
    }

}
