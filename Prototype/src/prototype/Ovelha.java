package prototype;

/**
 *
 * @author felipe
 */
public class Ovelha extends Animal {

    public Ovelha(String nomeOvelha) {
        this.animalNome = nomeOvelha;
        setAnimalNome(animalNome);
        andar();
        comer();

    }

}
