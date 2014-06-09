package prototype;

/**
 *
 * @author felipe
 */
public class PrototypeFactory {

    Animal prototypeAnimal;

    public PrototypeFactory(Animal animal) {
        prototypeAnimal = animal;
    }

    public Animal criaClone() {
        return (Animal) prototypeAnimal.clone();
    }

}
