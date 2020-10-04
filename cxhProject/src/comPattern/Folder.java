package comPattern;

import java.util.ArrayList;

public class Folder extends AbstractFile{
	private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
	private String name;
	public Folder(String name) {
		this.name=name;
	}
	public void add(AbstractFile file) {
		fileList.add(file);
	}
	public  void remove(AbstractFile file) {
		fileList.remove(file);
	}
	public  AbstractFile getChild(int i) {
		return (AbstractFile)fileList.get(i);
	}
	public void killVirus() {
		System.out.println("---���ļ���'"+name+"'����ɱ��'");
		for(Object obj:fileList) {
			((AbstractFile)obj).killVirus();
		}
	}
}
