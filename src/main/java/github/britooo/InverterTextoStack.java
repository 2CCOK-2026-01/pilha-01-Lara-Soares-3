package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */

        Pilha<Character> pilha = new Pilha<>(input.length());
        for (char c : input.toCharArray()) {
            pilha.push(c);
        }
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();

    }
}
