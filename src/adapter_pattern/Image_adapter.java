package adapter_pattern;

public class Image_adapter implements  Image_viewer{
    Advance_image_viewer advance_format_viewer;

    public Image_adapter(String imageFormat) {
        if (imageFormat.equalsIgnoreCase("Jpg")) {
            advance_format_viewer = new Jpg_Shower();

        }

        else
        if (imageFormat.equalsIgnoreCase("Png")){
            advance_format_viewer=new Png_Shower();

        }
    }

    @Override
    public void Show(String fileName,String imageFormat) {
        if (imageFormat.equalsIgnoreCase("Jpg")){
            advance_format_viewer.ShowJpg(fileName);
        }

        else
        if (imageFormat.equalsIgnoreCase("Png")){
            advance_format_viewer.ShowPng(fileName);
    }}


}