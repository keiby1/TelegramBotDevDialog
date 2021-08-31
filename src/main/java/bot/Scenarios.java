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

        listCommands.add(new Command("/API", "В системе реализовано 1 апи /transfer"));
        listCommands.add(new Command("/Protocols", "Протокол http"));
        listCommands.add(new Command("/Example", ""));
        listCommands.add(new Command("/Integrations", "У системы есть интеграция с системой проаеряющей валидность операции. Система ожидаетзапрос по пути /validation"));
        listCommands.add(new Command("/IntegrationsExample", "Пример запроса: body{}"));
        listCommands.add(new Command("/IntegrationsExample", "Пример ответа: body{}"));
        listCommands.add(new Command("/IntegrationsExample", "В среднем эта система отвечает за 2 секунды"));

        listCommands.add(new Command("/Requirements", "Требования по Временам отклика /SLA и по запасу производителности /Performance"));
        listCommands.add(new Command("/SLA", "Операции должны выполняться за 3сек"));
        listCommands.add(new Command("/Performance", "Система должна выдерживать нагрузку в 100тпс"));

        listCommands.add(new Command("/Somethingelse", ""));
    }
}
