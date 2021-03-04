package com.prituladima.lessons.lesson3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

public class ImageUtil {

    private static final String NAME = "generated_image_";
    private static final String EXTENSION = ".jpg";

    public static int[][] getPixelsFromImage(String fileName) {
        BufferedImage bufferedImage;
        try {
            File outputFile = new File(fileName);
            bufferedImage
                    = ImageIO.read(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        int[][] pixels = new int[bufferedImage.getWidth()][bufferedImage.getHeight()];
        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                pixels[i][j] = bufferedImage.getRGB(i, j);
            }
        }
        return pixels;
    }

    public static String getImageFromPixels(int[][] pixels) {
        BufferedImage bufferedImage
                = new BufferedImage(pixels.length, pixels[0].length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                bufferedImage.setRGB(i, j, pixels[i][j]);
            }
        }
        String fileName = null;
        try {
            fileName = NAME + UUID.randomUUID() + new Date() + EXTENSION;
            File outputFile = new File(fileName);
            ImageIO.write(bufferedImage, "jpg", outputFile);
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

}
