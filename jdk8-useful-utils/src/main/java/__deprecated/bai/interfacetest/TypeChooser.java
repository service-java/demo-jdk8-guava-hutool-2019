package __deprecated.bai.interfacetest;

public class TypeChooser {

    public static ImageSaver getSaver(String type) {
        if (type.equalsIgnoreCase("GIF")) {
            return new GIFSaver();
        } else if (type.equalsIgnoreCase("JPEG")) {
            return new JPEGSaver();
        } else if (type.equalsIgnoreCase("PNG")) {
            return new PNGSaver();
        } else {
            return null;
        }
    }
}