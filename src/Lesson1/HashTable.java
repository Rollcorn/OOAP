public class HashTable<T> {
    int capacity; // вместимость таблицы
    int size; // количество элементов в таблице
    /*************************************************************************
     * Статусы
     */
    private boolean REMOVE_STATUS;
    private boolean PUT_STATUS;
    private boolean HAS_VALUE_STATUS;
    private boolean SIZE_STATUS;

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
    public int remove(T value) { }

    // предусловие: в таблице есть место
    // постусловие: в таблецу вставляется новый элемент
    public int put(T value) { } // попытка добавления нового элемента в хэш-таблицу


    /*************************************************************************
     * Запросы
     */
    public boolean get(T value) { } // элемент присутствует в таблице; элемент отсутствует в таблице

    public int size() { } // количества элементов в таблице


    /*************************************************************************
     * Запросы статусов
     */
    // успешно; нет свободного слота для вставки элемента
    public int getPutStatus() { }

    // успешно; значение отсутствует в таблице;
    public int getRemoveTailStatus() { }
}
