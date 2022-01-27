package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        // Não está setando corretamente a fila - investigar problema
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        //Por não estar setando corretamente, não dá pra pegar o primeiro da fila
        //System.out.println(minhaFila);

    }
}
