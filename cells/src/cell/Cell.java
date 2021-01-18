package cell;

import java.awt.Graphics;

//Java不支持多继承
public interface Cell
{
    /*
     * 接口：纯抽象类，所有成员函数抽象，所有成员变量public static final
     * 类可以实现很多接口
     * 接口可以继承接口，但不能继承类
     * 接口不能实现接口
     * 设计程序时先定义接口，再实现类；在函数间传入传出的一定是接口而不是类
     * */
    void draw(Graphics g, int x, int y, int size);
}
