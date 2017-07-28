package cn.luntaibang.talos.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>轮胎邦API服务启动Main方法</p>
 * @author arrows
 */
@SpringBootApplication
public class TalosApiServer {

    public static void main(String[] args){
        SpringApplication.run(TalosApiServer.class,args);
    }

}
