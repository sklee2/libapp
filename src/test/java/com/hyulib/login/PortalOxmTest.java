package com.hyulib.login;

import com.hyulib.login.domain.PortalLoginResponse;
import com.hyulib.login.portalsso.PortalSsoOxmConfig;
import com.hyulib.login.portalsso.Converter;
import com.hyulib.login.portalsso.PortalSsoRequest;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sklee on 2015. 12. 31..
 */
public class PortalOxmTest {
    @Test
    public void testCastorXml() throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(PortalSsoOxmConfig.class);
        ctx.refresh();
        Converter converter = ctx.getBean(Converter.class);

        PortalSsoRequest portalSsoRequest = new PortalSsoRequest();
        InputStream in = portalSsoRequest.portalLogin("sklee", "hyulib1361");
        PortalLoginResponse ResponseObject = null;

        ResponseObject = (PortalLoginResponse) converter.doUnMarshaling(in);

        System.out.println("After UnMarshaling Data is: id:"+ ResponseObject.getData().getUserId()+", Name:"+ResponseObject.getData().getName());

    }
}
