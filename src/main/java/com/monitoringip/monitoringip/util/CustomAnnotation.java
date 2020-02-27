package com.monitoringip.monitoringip.util;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Component
    public @interface BotController {
        String[] value() default {};
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BotRequestMapping {
        String[] value() default {};
        BotRequestMethod[] method() default {BotRequestMethod.MSG};
    }

}
