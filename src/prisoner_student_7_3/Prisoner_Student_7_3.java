public class Prisoner_Student_7_3 {

    // Fields
    public String name;
    public double height;
    public int sentence;
    
    // Constructor
    public Prisoner_Student_7_3(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    
    // Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
    
    public static void main(String[] args) {
        // Instanciando um prisioneiro sem inicializar os campos
        Prisoner_Student_7_3 prisoner = new Prisoner_Student_7_3(null, 0.0, 0);
        
        // Tentando imprimir o valor de cada campo
        System.out.println("Name: " + prisoner.name);
        System.out.println("Height: " + prisoner.height);
        System.out.println("Sentence: " + prisoner.sentence);
    }
}
