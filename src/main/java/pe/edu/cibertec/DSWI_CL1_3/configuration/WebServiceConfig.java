package pe.edu.cibertec.DSWI_CL1_3.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "personajes")
    public DefaultWsdl11Definition defaultWsdl11DefinitionPersonaje(XsdSchema personajeSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("PersonajePort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/soapservice/personajes");
        definition.setSchema(personajeSchema);
        return definition;
    }

    @Bean
    public XsdSchema personajeSchema() {
        return new SimpleXsdSchema(new ClassPathResource("personajes.xsd"));
    }

    @Bean(name = "programas")
    public DefaultWsdl11Definition defaultWsdl11DefinitionPrograma(XsdSchema programaSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ProgramaPort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/soapservice/programas");
        definition.setSchema(programaSchema);
        return definition;
    }

    @Bean
    public XsdSchema programaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("programas.xsd"));
    }
}
