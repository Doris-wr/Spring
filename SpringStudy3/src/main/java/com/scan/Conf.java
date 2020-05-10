package com.scan;

import com.ioc.Duck;
import com.ioc.DuckShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author:wangrui
 * @Date:2020/5/7 13:51
 */
@Configuration
public class Conf {
    @Bean
    //定义了名称为duck3的对象，将它注册到容器中
    public Duck duck3(){//Bean的名称是方法名
        return new Duck("duck33333");
    }
    @Bean("duck4")
    public Duck duck4444(){//Bean的名称是以注解里传入的参数命名的
        return new Duck("唐老鸭");
    }

    @Bean
    public DuckShop duckShop2(Duck duck3,Duck duck4){
        DuckShop duckShop=new DuckShop();
        duckShop.setName("卤鸭店");
        List<Duck>ducks=new ArrayList<>();
        System.out.printf("=============duck5=%s,duck6=%s\n",duck3.getName(),
                duck4.getName());
        ducks.add(duck3);
        ducks.add(duck4);
        duckShop.setDucks(ducks);
        return duckShop;
    }
}
