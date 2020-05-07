package com.scan;

import com.ioc.Duck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:wangrui
 * @Date:2020/5/7 13:51
 */
@Configuration
public class Conf {
    @Bean
    public Duck duck3(){//Bean的名称是方法名
        return new Duck("duck33333",1);
    }
    @Bean("dck4")
    public Duck duck4444(){//Bean的名称是以注解里传入的参数命名的
        return new Duck("唐老鸭",2);
    }
}
