import java.util.ArrayList;
import java.util.List;

class BoundedStack<T> {

    // скрытые поля
    private List<T> stack; // основное хранилище стека
    private int peekStatus; // статус запроса peek()
    private int popStatus; // статус команды pop()
    private int capacityStatus; // статус команды pop()
    private int capacity = 32;

    // интерфейс класса, реализующий АТД BoundedStack
    private final int POP_NIL = 0; //
    private final int POP_OK = 1;
    private final int POP_ERR = 2;
    private final int PEEK_NIL = 0;
    private final int PEEK_OK = 1;
    private final int PEEK_ERR = 2;
    private final int CAPACITY_OK = 1;
    private final int CAPACITY_NIL = 0;

    // конструкторы:
    // постусловие: создан новый пустой стек
    public BoundedStack(final int capacity) { // конструктор
        this.capacity = capacity;
        clear(capacity);
    }

    // постусловие: создан новый пустой стек
    public BoundedStack() {
        clear(capacity);
    }

    // команды:
    // предусловие: количество элементов в стеке меньше максимально допустимого объема
    // постусловие: в конец стека добавлен новый элемент
    public void push(T value) {
        if (getCapacityStatus() == CAPACITY_OK) {
            stack.add(value);
            popStatus = POP_OK;
        }
        setCapacityStatus();
    }

    // предусловие: стек не пустой
    // постусловие: удален последний элемент стека
    public void pop() {
        if (stack.isEmpty()) {
            popStatus = POP_ERR;
        } else {
            stack.remove(stack.size() - 1);
            popStatus = POP_OK;
        }
        setCapacityStatus();
    }

    private void setCapacityStatus() {
        if (stack.size() == capacity) {
            capacityStatus = CAPACITY_NIL;
        } else {
            capacityStatus = CAPACITY_OK;
        }
    }

    // запросы:
    // постусловие: стек не содержит элементов
    public void clear(final int capacity) {
        stack = new ArrayList<>(capacity); // пустой список/стек
        // начальные статусы для предусловий peek() и pop()
        peekStatus = PEEK_NIL;
        popStatus = POP_NIL;
        capacityStatus = CAPACITY_OK;
    }

    // предусловие: стек не пустой
    public T peek() {
        T result;
        if (stack.isEmpty() ) {
            result = null;
            peekStatus = PEEK_ERR;
        } else {
            result = stack.get(stack.size() - 1);
            peekStatus = PEEK_OK;
        }
        return result;
    }

    public int size() {
        return stack.size();
    }

    //  дополнительные запросы
    public int getPopStatus() {
        return popStatus;
    }
    public int getPeekStatus() {
        return peekStatus;
    }
    public int getCapacityStatus() {
        return capacityStatus;
    }

    public static void main(String[] args) {
        BoundedStack<Integer> boundedStack = new BoundedStack<>();

        System.out.println("Capacity equal to 32: " + (boundedStack.capacity == 32));
        System.out.println("Stack size: " + boundedStack.size());
        boundedStack.push(1);
        boundedStack.push(2);
        System.out.println("Stack capacity: " + boundedStack.capacity);
        System.out.println("Stack size: " + boundedStack.size());
        System.out.println("Stack peak: " + boundedStack.peek());

        for (int i = 0; i < 32; ++i) {
            boundedStack.push(i);
        }
        System.out.println("Stack capacity: " + boundedStack.capacity);
        System.out.println("Stack size: " + boundedStack.size());
        System.out.println("Stack peak: " + boundedStack.peek());

    }

}