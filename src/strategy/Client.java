
package strategy;



public class Client {

    public static void main(String[] args) {
        Language language = new Language(new ConvertToXML()) ;
        language.convert();

        language = new Language(new ConvertToCSV()) ;
        //language.convert();

        language = new Language(new ConvertToJSON()) ;
        //language.convert();
    }    
}
 