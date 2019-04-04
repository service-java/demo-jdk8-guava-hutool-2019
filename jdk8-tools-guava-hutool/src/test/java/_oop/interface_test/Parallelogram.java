package _oop.interface_test;

// 调用父类方法 ===================================
//class Quadrangle { // 四边形类
//    public static void draw(Quadrangle q) { // 四边形类中的方法
//        // SomeSentence
//    }
//}
//
//public class Parallelogram extends Quadrangle { // 平行四边形类，继承了四边形类
//    public static void main(String args[]) {
//        Parallelogram p = new Parallelogram(); // 实例化平行四边形类对象引?
//        draw(p); // 调用父类方法
//    }
//}


// 向上转型 ======================================
//class Quadrangle {
//    public static void draw(Quadrangle q) {
//        // SomeSentence
//    }
//}
//
//public class Parallelogram extends Quadrangle {
//    public static void main(String args[]) {
//        draw(new Parallelogram());
//        // 将平行四边形类对象看作是四边形对象，称为向上转型操作
////        Quadrangle q = new Parallelogram();
//        // Parallelogram p=q; //将父类对象赋予子类对象，这种写法是错误的
//        // 将父类对象赋予子类对象，并强制转换为子类型，这种写法是正确的
////        Parallelogram p = (Parallelogram) q;
//    }
//}


class Quadrangle {
    public static void draw(Quadrangle q) {
        // SomeSentence
    }
}

class Square extends Quadrangle {
    // SomeSentence
}

class Anything {
    // SomeSentence
}


// instanceof 判断对象类型 ==============================
//public class Parallelogram extends Quadrangle {
//    public static void main(String args[]) {
//        Quadrangle q = new Quadrangle(); // 实例化父类对?
//        if (q instanceof Parallelogram) { // 判断父类对象是否为Parallelogram子类的一个实?
//            Parallelogram p = (Parallelogram) q; // 向下转型操作
//        }
//        if (q instanceof Square) { // 判断父类对象是否为Parallelogram子类的一个实?
//            Square s = (Square) q; // 进行向下转型操作
//        }
//        // 由于q对象不为Anything类的对象，所以这条语句是错误?
//        // System.out.println(q instanceof Anything);
//    }
//}

// get





