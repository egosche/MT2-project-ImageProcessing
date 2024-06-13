package project;

import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Task_3_Otsu implements PlugInFilter {
    int NUM_INTENSITY_LEVELS = 256;

    @Override
    public int setup(String s, ImagePlus imagePlus) {
        return DOES_8G;
    }

    @Override
    public void run(ImageProcessor imageProcessor) {

    }
}
