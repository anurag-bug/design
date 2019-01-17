interface FileReceiver{
	public abstract void openFile();
	public abstract void closeFile();
	public abstract void writeFile();
}
class WindowsFileReceiver implements FileReceiver{
	public void openFile(){
		System.out.println("Opening file in windows");
	}
	public void closeFile(){
		System.out.println("Closing file in windows");
	}
	public void writeFile(){
		System.out.println("Writing file in windows");
	}
}

class LinuxFileReceiver implements FileReceiver{
	public void openFile(){
		System.out.println("Opening file in Linux");
	}
	public void closeFile(){
		System.out.println("Closing file in Linux");
	}
	public void writeFile(){
		System.out.println("Writing file in Linux");
	}
}
interface Command{
	 void execute();
}

class OpenFileCommand implements Command{
	private FileReceiver fr;
	public OpenFileCommand(FileReceiver fr){
		this.fr=fr;
	}
	public void execute(){
		fr.openFile();
		
	}
}
class CloseFileCommand implements Command{
	private FileReceiver fr;
	public CloseFileCommand(FileReceiver fr)
	{
		this.fr=fr;
	}
	public void execute(){
		fr.closeFile();
	}
}
class WriteFileCommand implements Command{
	private FileReceiver fr;
	public WriteFileCommand(FileReceiver fr){
		this.fr=fr;
	}
	public void execute(){
		fr.writeFile();
	}
}
class FileInvoker {
	private Command cd;
	public FileInvoker(Command cd)
	{
		this.cd=cd;
	}
	public void excecute(){
		cd.execute();
	}
}
public class TestCommand {
	public static void main(String args[])
	{
		FileReceiver fr = new WindowsFileReceiver();
		Command open_file = new OpenFileCommand(fr);

		FileInvoker fi = new FileInvoker(open_file);
		fi.excecute();
	}

}
