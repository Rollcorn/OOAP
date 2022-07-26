import java.util.List;

public class DynArray<T> {
    public int count;
    public int capacity;
    public List<T> array;

    /************************************************************************
     * Конструктор
     */
    public DynArray() {
        clear();
    }

    /*************************************************************************
     * Статусы
     */
    private boolean GET_STATUS;
    private boolean APPEND_STATUS;
    private boolean INSERT_STATUS;
    private boolean REMOVE_STATUS;
    private boolean GET_STATUS;
    private boolean SIZE_STATUS;

    /*************************************************************************
     * Команды
     */
    // предусловие: массив не пустой; объект с таким индексом существует; если размер списка равен вместимости
    //              массива - вместимость увеличивается
    public T get(int index) { }

    // предусловие: имеется место для добавления элемента
    // постусловие: в конец массива добавлен эллемент
    public void append(T item) { }

    // предусловие: индекс вставки меньше текщего размера массива
    // постусловие: в указанный индекс добавлен переданный элемент; если в индексе уже есть элемент, то он заменяется;
    //              если размер списка равен вместимости массива - вместимость увеличивается
    public void insert(int index, T item) { }

    // предусловие: список не пустой; эллемент существует
    // постусловие: первый элемент равный данном удаляется из списка
    public void remove(T item) { }

    // постусловие: список пуст
    public void clear() {}

    /*************************************************************************
     * Запросы
     */
    public boolean isValue() { }
    public int size() { }

    /*************************************************************************
     * Запросы статусов
     */
    // успешно; список пуст; элемент не доступен
    public boolean getGetStatus() {
        return GET_STATUS;
    }

    // успешно; элемент не вставлен
    public boolean getAppendStatus() {
        return APPEND_STATUS;
    }

    // успешно; элемент не вставлен
    public boolean getInsertStatus() {
        return INSERT_STATUS;
    }

    // успешно; список пуст; элемент отсутствует
    public boolean getRemoveStatus() {
        return REMOVE_STATUS;
    }

    // успешно; список пуст
    public boolean getSizeStatus() {
        return SIZE_STATUS;
    }
}
