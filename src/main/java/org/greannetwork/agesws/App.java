package org.greannetwork.agesws;

import java.rmi.RemoteException;

import com.novativa.www.ws.streamsterapi.Bar;
import com.novativa.www.ws.streamsterapi.StreamsterApiInterfaceProxy;
import java.util.Arrays;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class App {

    public static void main(String[] args) throws RemoteException {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = proxy.getBars("EUR/USD", "Daily", "f");
        
        for(Bar bar : Arrays.asList(bars)){
            String reflectionToString = ReflectionToStringBuilder.reflectionToString(bar, ToStringStyle.MULTI_LINE_STYLE);
            System.out.println(reflectionToString);
        }
    }
}
