package cn.luntaibang.talos.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>轮胎邦管理服务启动Main方法</p>
 * @author arrows
 */
@SpringBootApplication
@PropertySource({"classpath:/config/${env}/jdbc.properties"})
public class TalosAdminServer {

    public static void main(String[] args){
        SpringApplication.run(TalosAdminServer.class,args);
    }
}
