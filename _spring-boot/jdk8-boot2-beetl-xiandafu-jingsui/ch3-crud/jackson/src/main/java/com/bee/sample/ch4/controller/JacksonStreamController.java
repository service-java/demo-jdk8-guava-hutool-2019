package com.bee.sample.ch4.controller;

import java.io.IOException;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/stream")
public class JacksonStreamController {
    Log log = LogFactory.getLog(JacksonStreamController.class);

    @Qualifier("getObjectMapper")
    @Autowired
    ObjectMapper mapper;

    @RequestMapping("/parser")
    public @ResponseBody
    String parser() throws JsonParseException, IOException {

        String json = "{\"name\":\"lijz\",\"id\":10}";
        JsonFactory f = mapper.getFactory();
        String key = null;
        String value;

        JsonParser parser = f.createParser(json);

        JsonToken token = parser.nextToken();

        token = parser.nextToken();
        if (token == JsonToken.FIELD_NAME) {
            key = parser.getCurrentName();
        }

        token = parser.nextToken();

        //"lijz"
        value = parser.getValueAsString();
        parser.close();
        return key + "," + value + "token";
    }


    @RequestMapping("/generator")
    public @ResponseBody
    String generator() throws JsonParseException, IOException {
        JsonFactory f = mapper.getFactory();
        // 输出到stringWriter
        StringWriter sw = new StringWriter();
        JsonGenerator g = f.createGenerator(sw);

        g.writeStartObject();
        // "message", "Hello world!"
        g.writeStringField("name", "李尔");
        g.writeEndObject();
        g.close();

        return sw.toString();
    }


}
