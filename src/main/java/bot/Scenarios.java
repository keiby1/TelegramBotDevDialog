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

    public void init(){
        listCommands.add(new Command("/project", ""));
        listCommands.add(new Command("/About", ""));

        listCommands.add(new Command("/API", ""));
        listCommands.add(new Command("/Protocols", ""));
        listCommands.add(new Command("/Example", ""));
        listCommands.add(new Command("/Integrations", ""));

        listCommands.add(new Command("/Requirements", ""));
        listCommands.add(new Command("/SLA", ""));
        listCommands.add(new Command("/Performance", ""));

        listCommands.add(new Command("/Somethingelse", ""));
    }
}
