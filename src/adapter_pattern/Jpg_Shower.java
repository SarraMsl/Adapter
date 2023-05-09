package adapter_pattern;

public class Jpg_Shower implements Advance_image_viewer{


    @Override
    public void ShowPng( String fileName) {
        System.out.println("Showing png file. Name: "+ fileName);

    }

    @Override
    public void ShowJpg( String fileName) {
        System.out.println("Showing jpg file. Name: "+ fileName);

    }
}
