package study.DynamicProgrammming;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author syw
 * @date 2020/3/14 - 19:31
 * @Description
 */
public class LongestIncSub {
    private static final Logger mylog = Logger.getLogger("com.study.log");


    public static void main(String[] args) {
        int x = 0;

        if (System.getProperty("java,util.logging.config.dass") == null
                && System.getProperty("java.util.logging.config.file") == null){
            try{
                Logger.getLogger("").setLevel(Level.ALL);
                final int LOG_RROTATION_COUNT = 10;
                Handler handler = new FileHandler("H:/Java复习/log.txt",0,LOG_RROTATION_COUNT);
                Logger.getLogger("").addHandler(handler);
            }catch (IOException e){
                mylog.log(Level.WARNING,"cannot creat log file handler");
            }
        }

        //assert x == 1;
        Logger.getGlobal().info("x="+x);
        Logger.getGlobal().warning("x="+x);
        Logger.getGlobal().severe("x="+x);
        mylog.log(Level.INFO,"x="+x);
        mylog.log(Level.WARNING,"x="+x);
        mylog.log(Level.SEVERE,"x="+x);
        System.out.println(x);



    }
}