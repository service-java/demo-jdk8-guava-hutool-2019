package __deprecated._bai.interfacetest;

public interface ImageSaver {
    void save(); // 可以存储方法和常?
}

class GIFSaver implements ImageSaver {

    @Override
    public void save() {
        System.out.println("将图片保存成GIF格式");
    }
}

class JPEGSaver implements ImageSaver {

    @Override
    public void save() {
        System.out.println("将图片保存成JPG格式");
    }
}

class PNGSaver implements ImageSaver {

    @Override
    public void save() {
        System.out.println("将图片保存成PNG格式");
    }

}

