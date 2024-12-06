package ifma.lista04;

public class DequeList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DequeList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Node<T> getFirst() {
        if (head == null) {
            throw new IllegalStateException("Deque is empty");
        }
        return head;
    }

    public Node<T> getLast() {
        if (tail == null) {
            throw new IllegalStateException("Deque is empty");
        }
        return tail;
    }

    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Deque is empty");
        }
        Node<T> firstNode = getFirst();
        head = head.getNext();
        if (head == null) {
            tail = null; // Lista ficou vazia
        }
        return firstNode.getData();
    }

    public T removeLast() {
        if (tail == null) {
            throw new IllegalStateException("Deque is empty");
        }
        Node<T> lastNode = getLast();
        if (head == tail) { // Apenas um elemento na lista
            head = tail = null;
        } else {
            Node<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
        }
        return lastNode.getData();
    }

    public Node<T> search(String nome) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData() instanceof Aluno) {
                Aluno aluno = (Aluno) current.getData();
                if (aluno.toString().contains(nome)) {
                    return current;
                }
            }
            current = current.getNext();
        }
        throw new IllegalArgumentException("Aluno com o nome '" + nome + "' não encontrado.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData().toString());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}