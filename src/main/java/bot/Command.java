package bot;

public class Command {
    String command;
    String response;

    public Command(String command, String response) {
        this.command = command;
        this.response = response;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
