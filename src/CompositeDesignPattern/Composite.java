
package CompositeDesignPattern;

import java.util.ArrayList;

public abstract class Composite implements IShape{
    protected ArrayList<IShape> iShape = new ArrayList<IShape>() ;
    
    @Override
    public void draw(){
        build() ;
        for(IShape iS:iShape) 
        { 
            iS.draw(); 
        }
    }
    
    public abstract void build();
}
