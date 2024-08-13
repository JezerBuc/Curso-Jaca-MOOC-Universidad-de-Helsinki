
public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }//constructor

    public String getFirstName() {
        return firstName;
    }//get Nombre

    public String getLastName() {
        return lastName;
    }//ges Apellido

    public String getIdentificationNumber() {
        return identificationNumber;
    }//get # de Identificación

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }//to String
}//clase informacion personal
