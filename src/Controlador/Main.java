package Controlador;

import java.io.File;
import Modelo.Image;
import Persistence.FileImageLoader;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\holbe\\Documents\\Imagenesxd\\");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
