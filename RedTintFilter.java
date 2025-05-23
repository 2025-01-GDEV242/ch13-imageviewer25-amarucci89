import java.awt.Color;

/**Red Tint Filter
 * An image filter that tints the image red.
 *
 * @author Alessandro Marucci
 * @version 04.21.2025
 */
public class RedTintFilter extends Filter
{
    /**
     * Constructor for objects of class RedTintFilter.
     * @param name The name of the filter.
     */
    public RedTintFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int avg = (pix.getRed() + pix.getGreen() + pix.getBlue()) / 3;
                image.setPixel(x, y, new Color(avg, avg, avg));
                
                Color newColor = new Color(255, 0, 0);
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }
}
