package prototype;

/**
 *
 * @author felipe
 */
public abstract class Animal implements Cloneable {

    String animalNome;

    public String getAnimalNome() {
        return animalNome;
    }

    public void setAnimalNome(String animalNome) {
        this.animalNome = animalNome;
    }

    public void comer() {
        System.out.println(animalNome + " Está Comendo...");
    }

    public void andar() {
        System.out.println(animalNome + " Está Andando...");
    }

    @Override
    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("A ovelha não informada");
        }
        return o;
    }

}
