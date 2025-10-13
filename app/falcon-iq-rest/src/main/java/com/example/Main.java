package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class Main {
  public static void main(String[] args) throws Exception {
    int port = Integer.parseInt(System.getProperty("PORT", "8080"));
    Server server = new Server(port);

    // Root context
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");

    // Wire Jersey's Servlet into Jetty and point it at our AppConfig
    ServletHolder jersey = new ServletHolder(new ServletContainer(new AppConfig()));
    jersey.setInitOrder(0); // load early
    context.addServlet(jersey, "/api/*");

    server.setHandler(context);

    try {
      server.start();
      System.out.println("Server running at http://localhost:" + port + "/api/*");
      server.join();
    } finally {
      server.stop();
    }
  }
}
