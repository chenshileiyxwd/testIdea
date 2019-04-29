package com.company;

/**
 * @ClassName serImpl
 * @Description TODO
 * @Author mrleier
 * @Date 2019/4/27 1:19
 * @Version 1.0
 **/
public class serImpl implements ser {
    @Override
    public void setcsl() {
        PersonBean personBean = new PersonBean();
        personBean.setAddress("dsdf");
        System.out.println(personBean);
    }
}
