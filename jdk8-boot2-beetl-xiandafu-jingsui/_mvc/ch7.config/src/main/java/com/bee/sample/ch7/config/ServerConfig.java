package com.bee.sample.ch7.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("server")
@Configuration
public class ServerConfig {
    private int port;
    private Servlet servlet = new Servlet();

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


    public Servlet getServlet() {
        return servlet;
    }

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }


    public static class Servlet {
        String path;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

    }
}
