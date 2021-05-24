/**
 * Реализация Generic-класса
 */
public class Generics1 {
    private static class Holder<T> {
        private final T item;

        public Holder(T item) {
            this.item = item;
        }

        public T getItem() {
            return  item;
        }
    }

    public static void main(String[] args) {
        Holder<Integer> h1 = new Holder<>(5);
        System.out.printf("h1 = %s\n", h1.getItem());

        Holder<String> h2 = new Holder<>("Some word");
        System.out.printf("h2 = %s\n", h2.getItem());

    }
}
