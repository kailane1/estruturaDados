package ifma.lista03;

public class SimpleList {
    private Node head;

    public SimpleList() {
        head = null;
    }

    public void adicionarInicio(int valor) {
        Node newNode = new Node(valor);
        newNode.next = head;
        head = newNode;
    }


    public void adicionarFim(int valor) {
        if (head == null) {
            adicionarInicio(valor);
        } else {
            Node newNode = new Node(valor);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public int removerComeco() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        int valor = head.data;
        head = head.next;
        return valor;
    }

    public int removerFinal() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        if (head.next == null) {
            int valor = head.data;
            head = null;
            return valor;
        }
        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }
        int valor = current.next.data;
        current.next = null;
        return valor;
    }

    public int maiorValor() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        int max = head.data;
        Node current = head;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }


    public int menorValor() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        int min = head.data;
        Node current = head;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public double mediaValores() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        int sum = 0;
        int count = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            count++;
            current = current.next;
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}