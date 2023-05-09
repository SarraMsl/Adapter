package adapter_pattern;

public class Gallery_App implements Image_viewer{
  Image_adapter image_adapter;
    @Override
    public void Show(String imageFormat,String fileName) {

        if (imageFormat.equalsIgnoreCase("app")){
        System.out.println("Showing app file. Name: "+ fileName);}

        else
            if (imageFormat.equalsIgnoreCase("Png")||imageFormat.equalsIgnoreCase("Jpg")){
            image_adapter=new Image_adapter(imageFormat);
            image_adapter.Show(fileName,imageFormat);


        }
        else {
                System.out.println("Invalid Format. " + imageFormat + " format not supported");
            }
    }
}
