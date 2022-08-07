/***********************************************************************************************************************
 *
 * @param <T>
 */
class ParentQueue<T> {
    /*************************************************************************
     * Статусы
     */
    private boolean ADD_TAIL_STATUS;
    private boolean REMOVE_FRONT_STATUS;


    /************************************************************************
     * Конструктор
     */
    // постусловие: пустая очередь
    public ParentQueue(){ }


    /*************************************************************************
     * Команды
     */
    // постусловие: в конце очереди появляется новый элемент
    public void addTail(T item) { }

    // предусловие: очередь пне пустая
    // постусловие: из начала очереди удаляется элемент
    public T removeFront() { }

    /*************************************************************************
     * Запросы
     */
    // предусловие: очередь не пуста
    public T getFront() { } // получить  значение элемента из головы очереди

    public int size() { } // текущий размер очерди


    /*************************************************************************
     * Запросы статусов
     */
    // успешно; очередь пуста;
    public boolean getRemoveFrontStatus() { }

    // успешно; очередь пуста
    public boolean getAddTailStatus() { }
}


/***********************************************************************************************************************
 * Одностороняя очередь FIFO
 * @param <T>
 */
class Queue<T> extends ParentQueue<T> {
    /************************************************************************
     * Конструктор
     */
    // постусловие: пустая очередь
    public Queue(){ }
}


/***********************************************************************************************************************
 * Двусторонняя очередь
 * @param <T>
 */
class Deque<T> extends ParentQueue<T> {
    /*************************************************************************
     * Статусы
     */
    private boolean ADD_FRONT_STATUS;
    private boolean REMOVE_TAIL_STATUS;


    /************************************************************************
     * Конструктор
     */
    // постусловие: пустая очередь
    public Deque(){ }


    /*************************************************************************
     * Команды
     */
    // постусловие: в конце очереди появляется новый элемент
    public void addFront(T item) { }

    // предусловие: очередь пне пустая
    // постусловие: из начала очереди удаляется элемент
    public T removeTail() { }


    /*************************************************************************
     * Запросы
     */
    // предусловие: очередь не пуста
    public T getTail() { } // получить элемент из хвоста очереди


    /*************************************************************************
     * Запросы статусов
     */
    // успешно;
    public boolean getAddFrontStatus() { }

    // успешно; список пуст;
    public boolean getRemoveTailStatus() { }
}