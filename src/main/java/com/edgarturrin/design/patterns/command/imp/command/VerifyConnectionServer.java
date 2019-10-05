package com.edgarturrin.design.patterns.command.imp.command;

import com.edgarturrin.design.patterns.command.Command;
import com.edgarturrin.design.patterns.command.Server;

public class VerifyConnectionServer implements Command {

    private Server server;

    public VerifyConnectionServer(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.turnOn();
        server.verifyConnection();
        server.turnOff();
    }
}
