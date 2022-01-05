package java;

public class Greeter {
    //Costruttore con assegnazione variabili 
    public Greeter (String aName, String  aSurname){
        name = aName;
        surname = aSurname;
    }

    //Metodo per mostrare nome e cognome 
    public String sayHello(){
        String message = "Hello,"+ name + "" + surname + "!";
        return message;
    }
    private String name;
    private String surname;
}
