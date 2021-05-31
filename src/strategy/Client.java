
package strategy;



public class Client {

    public static void main(String[] args) {
        Language language = new Language() ;
        language.convert(new ConvertToXML());
        language.convert(new ConvertToCSV());
        language.convert(new ConvertToJSON());
    }    
}
 