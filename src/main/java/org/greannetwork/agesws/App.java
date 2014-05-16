package org.greannetwork.agesws;

import java.rmi.RemoteException;

import com.novativa.www.ws.streamsterapi.Bar;
import com.novativa.www.ws.streamsterapi.StreamsterApiInterfaceProxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws RemoteException {

        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = proxy.getBars("EUR/USD", "5 minutes", "f");
        List<BigDecimal> collect = Arrays.asList(bars).stream().map(c -> c.getClose()).collect(Collectors.toList());

//        for (Bar bar : bars) {
//            System.out.println(bar.getBarDateTime().getTime() + " " + bar.getClose());
//        }
        System.out.println("#######");

        List<BigDecimal> ema10 = TraderUils.ema(collect, 10);
        List<BigDecimal> ema50 = TraderUils.ema(collect, 50);
        String[] mark = new String[3];
        List<String> logs = new ArrayList<>();
        
        System.out.println(collect.size()+" "+ema10.size()+" "+ema50.size());

        for (int i = 0; i < collect.size(); i++) {
            mark[2] = mark[1];
            mark[1] = mark[0];
            
            if(ema10.get(i).compareTo(ema50.get(i)) == 1){
                mark[0] = "+";
                System.out.print(" + ");
            }else if(ema10.get(i).compareTo(ema50.get(i)) == -1){
                mark[0] = "-";
                System.out.print(" - ");
            }else{
                mark[0] = "=";
                System.out.print(" = ");
            }
            System.out.println(i +" "+ bars[i].getBarDateTime().getTime() + " Close : "+collect.get(i)+" , Ema10 : "+ema10.get(i)+" , Ema50 : "+ema50.get(i));
            if(mark[0].equals("+") && mark[1].equals("=") && mark[2].equals("-")){
                System.out.println("B => " + collect.get(i));
                logs.add(i + " "+ bars[i].getBarDateTime().getTime()+" B => " + collect.get(i));
            }else if(mark[0].equals("+") && mark[1].equals("-") && mark[2].equals("-")){
                System.out.println("B => " + collect.get(i));
                logs.add(i + " "+ bars[i].getBarDateTime().getTime()+" B => " + collect.get(i));
            }else if(mark[0].equals("+") && mark[1].equals("=") && mark[2].equals("=")){
                System.out.println("B => " + collect.get(i));
                logs.add(i + " "+ bars[i].getBarDateTime().getTime()+" B => " + collect.get(i));
            }
            
            if(mark[0].equals("-") && mark[1].equals("=") && mark[2].equals("+")){
                System.out.println("S => " + collect.get(i));
                logs.add(i + " "+ bars[i].getBarDateTime().getTime()+" S => " + collect.get(i));
            }else if(mark[0].equals("-") && mark[1].equals("+") && mark[2].equals("+")){
                System.out.println("S => " + collect.get(i));
                logs.add(i + " "+ bars[i].getBarDateTime().getTime()+" S => " + collect.get(i));
            }
        }
        
        logs.stream().forEach((log) -> {
            System.out.println(log);
        });
    }
}
