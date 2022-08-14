class HashTable<T> {
    int capacity; // вместимость таблицы
    int size; // количество элементов в таблице
    /*************************************************************************
     * Статусы
     */
    private int REMOVE_STATUS;
    private int PUT_STATUS;
    private int GET_STATUS;
    private int SIZE_STATUS;

    /************************************************************************
     * Конструктор
     */
    // постусловие: создана пустая хеш-таблица опрделеннойго объема
    public HashTable(int capacity) { }


    /*************************************************************************
     * Команды
     */
    // предусловие: элемент есть в таблице
    // постусловие: элемент удаляется из таблицы
    public boolean remove(T value) { return false; }

    // предусловие: в таблице есть место
    // постусловие: в таблецу вставляется новый элемент
    public boolean put(T value) { return false; } // попытка добавления нового элемента в хэш-таблицу


    /*************************************************************************
     * Запросы
     */
    public boolean get(T value) { return false; } // элемент присутствует в таблице; элемент отсутствует в таблице

    public int size() { return size; } // количества элементов в таблице


    /*************************************************************************
     * Запросы статусов
     */
    // успешно; нет свободного слота для вставки элемента
    public int getPutStatus() { return PUT_STATUS; }

    // успешно; нет свободного слота для вставки элемента
    public int getGetStatus() { return GET_STATUS; }

    // успешно; значение отсутствует в таблице;
    public int getRemoveTailStatus() { return REMOVE_STATUS; }
}

class PowerSet<T> extends HashTable<T> {
    /*************************************************************************
     * Статусы
     */

    /************************************************************************
     * Конструктор
     */
    // постусловие: создано пустое множесво
    public PowerSet(int size) {
        super(size);
    }


    /*************************************************************************
     * Команды
     */
    // предусловие: элемент отсутствует в множстве; если элемент отсутствовал, то дабавленн новый элемент
    @Override
    public boolean put(T value) {
        return false;
    }

    /*************************************************************************
     * Запросы
     */
    // возвращает множество в котором есть только те элементы, которые имеются в каждом из множеств
    // пустое множество если нет общих элементов.
    PowerSet<T> intersection(PowerSet<T> other) { return null; }

    // возвращает множество в котором есть все элементы из каждого множества
    PowerSet<T> union(PowerSet<T> other) { return null; }

    // возвращает подмножество текущего множества из таких элементов, которые не входят в множество-параметр
    PowerSet<T> difference(PowerSet<T> other) { return null; }

    // будет ли множество-параметр подмножеством текущего множества
    boolean isSubset(PowerSet<T> other) { return false; }

    /*************************************************************************
     * Запросы статусов
     */


}
