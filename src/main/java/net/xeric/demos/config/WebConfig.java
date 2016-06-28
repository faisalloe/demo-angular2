package net.xeric.demos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//@Configuration
//@EnableWebMvc
@ComponentScan(basePackages = "net.xeric.demos.controllers")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/webjars*")) {
            registry.addResourceHandler("/webjars*").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
        if (!registry.hasMappingForPattern("/images*")) {
            registry.addResourceHandler("/images*").addResourceLocations("classpath:/static/images/");
        }
        if (!registry.hasMappingForPattern("/css*")) {
            registry.addResourceHandler("/css*").addResourceLocations("classpath:/static/css/");
        }
        if (!registry.hasMappingForPattern("/js*")) {
            registry.addResourceHandler("/js*").addResourceLocations("classpath:/static/js/");
        }

        if (!registry.hasMappingForPattern("/node_modules*")) {
            registry.addResourceHandler("/node_modules*").addResourceLocations("classpath:/static/node_modules/");
        }

        if (!registry.hasMappingForPattern("/templates/**")) {
            registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        }

    }
}
