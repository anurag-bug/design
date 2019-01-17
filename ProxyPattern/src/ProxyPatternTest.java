interface Image{
	void showImage();
}
class HighResImage implements Image {
	//heavy operation
	HighResImage(String path){
		loadImage(path);	
	}
	public void loadImage(String path){
		System.out.println("Image loaded from memory");
	}
	public void showImage(){
		System.out.println("Showing image");
	}
}
class ProxyImage implements Image{
	private Image img;
	private String imagePath;
	public ProxyImage(String path){
		imagePath=path;
	}
	public void showImage(){
		img=new HighResImage(imagePath);
		img.showImage();
	}
}
public class ProxyPatternTest {
	public static void main(String args[]){
		Image pImage1= new ProxyImage("C:\\Desktop\1.jpg");
		Image pImage2= new ProxyImage("C:\\Desktop\2.jpg");
		pImage2.showImage();
		Image hImage1 = new HighResImage("C:\\Desktop\3.jpg");
		Image hImage2 = new HighResImage("C:\\Desktop\4.jpg");
		hImage2.showImage();
	}

}
