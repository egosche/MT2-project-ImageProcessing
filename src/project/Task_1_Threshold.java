package project;

import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.plugin.filter.PlugInFilter;
import ij.process.ByteProcessor;
import ij.process.FloatProcessor;
import ij.process.ImageProcessor;

public class Task_1_Threshold implements PlugInFilter {
    @Override
    public int setup(String s, ImagePlus imagePlus) {
        return DOES_8G;
    }

    @Override
    public void run(ImageProcessor ip) {

       GenericDialog gd = new GenericDialog("Thresholding");
        gd.addNumericField("Threshold value:", 128, 0);
        gd.addCheckbox("Correct uneven illumination", false);
        gd.showDialog();

        //check if the dialog was canceled
        if (gd.wasCanceled())
            return;


    }
}
