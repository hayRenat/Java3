package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> extends ArrayList<T> {

    public float getWeight() {
        float x = Box.super.size();
        float y = Box.super.get(0).getWeight();
        float z = x * y;
        return z;
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight())
            return true;
        else return false;
    }

//    public void pour(Box box) {
//!!!!!!!  у меня проходит такой код если делать - appleBox.pour(orangeBox); appleBox в итоге пустой, а в OrangeBox лежат как апельсины так и яблоки, но такого быть не может!
//          System.out.println(orangeBox);
//        [Lesson1.Orange@880ec60, Lesson1.Orange@3f3afe78, Lesson1.Orange@7f63425a, Lesson1.Orange@36d64342, Lesson1.Apple@39ba5a14, Lesson1.Apple@511baa65, Lesson1.Apple@340f438e]
//       Помогите пожалуйста разобраться, как так происходит. Вручную добавлять яблоки к апельсинам не даёт (так и должно быть), а через метод добавляет и тем самым рушит всю логику!
//        box.addAll(this);
//        this.clear();
//    }
    public void pour(Box<T> box) {
        box.addAll(this);
        this.clear();
    }
}
