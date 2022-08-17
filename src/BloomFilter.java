public class BloomFilter {
    public int filter = 0;
    public int filterLen;
    final int FIRST_SIMPLE_NUM = 223;
    final int SECOND_SIMPLE_NUM = 17;


    /************************************************************************
     * Конструктор
     */
    // создан пустой фильтр
    public BloomFilter(int filterLen) {
        this.filterLen = filterLen;
    }

    /*************************************************************************
     * Статусы
     */
    private int ADD_STATUS;
    private int IS_VALUE_STATUS;

    /*************************************************************************
     * Команды
     */
    // постусловие: в фильтр добавлена новая сторка
    public void add(String value) {
        int hcode1 = ( 1 << hashFun(value, FIRST_SIMPLE_NUM) );
        int hcode2 = ( 1 << hashFun(value, SECOND_SIMPLE_NUM) );

        filter = filter | hcode1 | hcode2;
        ADD_STATUS = 1;
    }

    /*************************************************************************
     * Запросы
     */
    // предусловие: пареметр simpleNum - простое число
    // постусловие:
    public int hashFun(String str1, int simpleNum) {
        int hashCode = 0;
        int code;

        for (int i = 0; ( str1 != null ) &&  ( i < str1.length() ); i++) {
            code = str1.charAt(i);
            hashCode = ( hashCode * simpleNum + code ) % filterLen;
        }
        return hashCode;
    }

    // допускаются ложноположительные срабатывания (про несуществующий элемент сообщается,
    // что он в наличии), но не ложноотрицательные (когда существующий элемент не находится)
    public boolean isValue(String value) {
        int codePos1 = hashFun(value, FIRST_SIMPLE_NUM);
        int codePos2 = hashFun(value, SECOND_SIMPLE_NUM);
        boolean isValue = (moveBit(codePos1) == 1) && (moveBit(codePos2) == 1);
        if (isValue) {
            IS_VALUE_STATUS = 1;
        } else {
            IS_VALUE_STATUS = 0;
        }
        return isValue;
    }

    public int moveBit(int position){
        final int firstBit = 1;
        int bitPos = ( firstBit << position );
        return ( bitPos & filter ) / bitPos;
    }
    /*************************************************************************
     * Запросы статусов
     */
    // успешно; строка не вставленна
    public int getAddStatus() {
        return ADD_STATUS;
    }

    // строка принадлежит фильтру; строка не принадлежит фильтру
    public int getIsValueStatus() {
        return IS_VALUE_STATUS;
    }

}
