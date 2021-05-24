interface StringInterface{
    int dealString(String str);  //метод интерфейса получает строку, возвращает значение типа int
}


public class LambdaToMethodDemo {
    /*
     * Метод changeString() получает лямбда-выражение
     * (т.е. метод, набор действий) и строку,
     *  к которой нужно применить эти действия
     */
    static int changeString (StringInterface si, String str){
        return si.dealString(str);   //выполнить метод, записанный в переданном лямбда-выражении
    }

    public static void main(String[] args) {
        /*
         * В качестве аргумента метода changeString передается строковый метод length(),
         * который аналогично методу интерфейса dealString принимает строку  и возвращает int.
         * Обращение  к уже существующему статическому методу осуществляется по имени класса (String::length),
         * обращение к методу объекта - по имени объекта.
         *
         */
        System.out.println(changeString(String::length, "We love Java"));


        /*
         * Лямбда-выражение sint - блочное, подсчитывает количество пробелов в строке.
         */
        StringInterface sint = x -> {
            int count =0;
            for (int i = 0; i < x.length(); i++){
              if (x.charAt(i) == ' ') count++;
            }
            return count;
        };
        System.out.println(changeString(sint, "a s d f g "));
    }
}
