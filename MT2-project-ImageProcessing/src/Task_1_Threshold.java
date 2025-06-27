import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.plugin.filter.PlugInFilter;
import ij.process.Blitter;
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

        /*
       GenericDialog gd = new GenericDialog("Thresholding");
        gd.addNumericField("Threshold value:", 128, 0);
        gd.addCheckbox("Correct uneven illumination", false);
        gd.showDialog();

        //check if the dialog was canceled
        if (gd.wasCanceled())
            return;

        //get user choices
        int threshold = (int) gd.getNextNumber();
        boolean correct = gd.getNextBoolean();

        //correct illumination if selected
        ImageProcessor ipCopy;
        if (correct) {
            ipCopy = correctIllumination(ip);
        } else {
            ipCopy = ip;
        }
        // threshold the image
        ByteProcessor thresholdedIp = threshold(ipCopy, threshold);
        ImagePlus thresholdedImage = new ImagePlus("Thresholded Image", thresholdedIp);
        thresholdedImage.show();

         */
    }

}
