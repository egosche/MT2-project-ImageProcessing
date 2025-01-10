import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ByteProcessor;
import ij.process.ImageProcessor;

import java.awt.*;

public class Task_3_Otsu implements PlugInFilter {

    @Override
    public int setup(String s, ImagePlus imagePlus) {
        return DOES_8G;
    }

    @Override
    public void run(ImageProcessor imageProcessor) {

    }

    /*
    
    public double[] getHistogram(ImageProcessor in) {}

    public double[] getP1(double[] histogram) {}

    public double[] getP2(double[] P1) {}

    public double[] getMu1(double[] histogram, double[] P1) {}

    public double[] getMu2(double[] histogram, double[] P2) {}

    public double[] getSigmas(double[] P1, double[] P2, double[] mu1, double[] mu2) {}

    public int getMaximum(double[] sigmas) {}

    public ByteProcessor otsuSegmentation(ImageProcessor ip) {}

     */

}
