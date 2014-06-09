package prototype;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Main {

    public static void main(String[] args) {
        String nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do animal?"));
        PrototypeFactory prototype = new PrototypeFactory(new Ovelha(nome));
        Animal animal = prototype.criaClone();
        System.out.println("Nome do Animal: " + animal.getAnimalNome());
    }
}
