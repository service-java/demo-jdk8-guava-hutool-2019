package com.bee.sample.ch4.util.beetl;

import java.io.IOException;

import org.beetl.core.Tag;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleTag extends Tag {

    @Override
    public void render() {
        System.out.println(this);
        try {
            ctx.byteWriter.writeString("被删除了，付费可以看");
        } catch (IOException e) {
            //ingore
        }

    }

}
