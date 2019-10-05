package com.edgarturrin.design.patterns.command;

import com.edgarturrin.design.patterns.command.imp.command.TurnOnServer;
import com.edgarturrin.design.patterns.command.imp.command.VerifyConnectionServer;
import com.edgarturrin.design.patterns.command.imp.server.ArgentinaServer;
import com.edgarturrin.design.patterns.command.imp.server.UruguayServer;

public class App {
    public static void main(String[] args) {
        Server serverArgentina = new ArgentinaServer();

        Command turnOnServerA = new TurnOnServer(serverArgentina);

        Invoker invoker = new Invoker(turnOnServerA);

        invoker.run();

        Server serverUruguay = new UruguayServer();

        Command turnOnServerU = new VerifyConnectionServer(serverUruguay);

        invoker = new Invoker(turnOnServerU);

        invoker.run();
    }
}
