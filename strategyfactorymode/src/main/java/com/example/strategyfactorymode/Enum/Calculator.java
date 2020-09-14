package com.example.strategyfactorymode.Enum;

/**
 * @Author lijun
 * @Description
 * @Date 2020-03-26 8:59 上午
 **/

public enum Calculator {

    // 自己开车
    CAR {
        public float price(int km) {
            return (float) 0.5 * km;
        }
    },

    // 乘飞机
    PLANE {
        public float price(int km) {
            return (float) 50 * km;
        }
    },

    // 乘火车
    TRAIN {
        public float price(int km) {
            return (float) 0.1 * km;
        }
    };

    Calculator(){}

    public abstract float price(int km);
}
