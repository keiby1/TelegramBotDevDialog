package bot;

import java.util.LinkedList;

public class Scenarios {
    LinkedList<Command> listCommands;

    public Scenarios() {
        listCommands = new LinkedList<>();
    }

    public void add(Command comm){
        listCommands.add(comm);
    }

    public LinkedList<Command> getListCommands() {
        return listCommands;
    }

    public void setListCommands(LinkedList<Command> listCommands) {
        this.listCommands = listCommands;
    }
}
