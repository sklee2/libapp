package com.hyulib.login;

import com.hyulib.login.portalsso.PortalSsoRequest;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Created by sklee on 2015. 12. 30..
 */
public class PortalSsoRequestTest {
    @Test
    public void testPortalSSO() throws IOException {
        PortalSsoRequest portalSsoRequest = new PortalSsoRequest();
        InputStream in = portalSsoRequest.portalLogin("sklee", "0000");

    // response XML view
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String sResponse;
        String message = "";
        while ((sResponse = br.readLine()) != null) {
            message = message + sResponse + "\n";
        }
        br.close();
        System.out.println(message);

    }


}
