package io.github.dunwu.javacore.annotation;

/**
 * "@Override" 示例
 * @author Zhang Peng
 * @date 2019-03-30
 */
public class OverrideAnnotationDemo {

    static class Person {
        public String getName() {
            return "getName";
        }
    }


    static class Man extends Person {
        @Override
        public String getName() {
            return "override getName";
        }

        /**
         *  放开下面的注释，编译时会告警
         */
       /*
        @Override
        public String getName2() {
            return "override getName2";
        }
        */
    }

    public static void main(String[] args) {
        Person per = new Man();
        System.out.println(per.getName());
    }
}
