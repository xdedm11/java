package shapes;

import java.awt.Graphics;

public abstract class Shape {
	//抽象类无法产生对象，但可以定义变量，可以得到非抽象的子对象
	//有成员函数是抽象的，类也是抽象的
	//抽象类的子类必须覆盖抽象函数（实现）
	public abstract void draw(Graphics g);	//抽象无{}，无函数体

	public static void main(String[] args)
	{
//		Shape shape =new Shape();
	}
}
