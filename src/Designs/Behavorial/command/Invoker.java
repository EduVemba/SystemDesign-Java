package src.Designs.Behavorial.command;

import java.util.ArrayList;
import java.util.Collection;

public class Invoker {

    private Collection<Command> commands = new ArrayList<>();

    public void executAll(){
        for (Command command : commands){
            command.execute();
        }
    }
    public void deleteAll(){
        for (Command command : commands){
            command.delete();
        }
    }
}
