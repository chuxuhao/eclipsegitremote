package FacadePattern;

public class Client {
	public static void main(String[] args) {
		AbstractEncryptFacade ef;
		ef=(AbstractEncryptFacade)XMLUtil.getBean();
		ef.fileEncrypt("src//FacadePattern//src.txt", "src//FacadePattern//des.txt");
	}
}
