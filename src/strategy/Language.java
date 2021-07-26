package strategy;

public class Language {
    IConvert iConvert ;

    public Language(IConvert iConvert){
        this.iConvert = iConvert ;
    }

    public void convert(){
        iConvert.execute();
    }
}
