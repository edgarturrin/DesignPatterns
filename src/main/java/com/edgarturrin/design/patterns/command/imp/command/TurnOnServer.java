package com.edgarturrin.design.patterns.command.imp.command;

import com.edgarturrin.design.patterns.command.Command;
import com.edgarturrin.design.patterns.command.Server;

public class TurnOnServer implements Command {

    private Server server;

    public TurnOnServer(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.turnOn();
    }
}
