package com.ioc;

import java.util.List;

/**
 * @Author:wangrui
 * @Date:2020/5/6 19:40
 */

public class DuckShop {
    private String name;
    private List<Duck> ducks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }

    @Override
    public String toString() {
        return "DuckShop{"+
                "name="+name+
                ",ducks="+ducks+
                "}";
    }
}
