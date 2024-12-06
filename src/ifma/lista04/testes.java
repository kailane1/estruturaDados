package ifma.lista04;

public class testes{
    public static void main(String[] args) {
        DequeList<Aluno> deque = new DequeList<>();

        deque.addLast(new Aluno("João", 8.5, 7.8));
        deque.addLast(new Aluno("Emilly", 7.1, 9.0));
        deque.addLast(new Aluno("Carlos", 6.5, 8.2));

        System.out.println("Lista atual: " + deque);

        System.out.println("Primeiro: " + deque.getFirst().getData());
        System.out.println("Último: " + deque.getLast().getData());

        System.out.println("Removendo primeiro: " + deque.removeFirst());
        System.out.println("Removendo último: " + deque.removeLast());

        System.out.println("Lista após remoções: " + deque);

        try {
            System.out.println("Procurando por Emilly: " + deque.search("Emilly").getData());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Procurando por Pedro: " + deque.search("Pedro").getData());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}