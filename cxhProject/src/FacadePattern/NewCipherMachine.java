package FacadePattern;

public class NewCipherMachine {
	public String encrypt(String plainText) {
		System.out.println("���ݼ��ܣ�������ת��Ϊ����");
		String es="";
		int key=10;
		for(int i=0;i<plainText.length();i++) {
			char c=plainText.charAt(i);
			if(c>='a' && c<='z') {
				c+=key%26;
				if(c>'z') c-=26;
				if(c<'a') c+=26;
			}
			if(c>='A' && c<='Z') {
				c+=key % 26;
				if(c>'Z') c-=26;
				if(c<'A') c+=26;
			}
			es+=c;
		}
		System.out.println(es);
		return es;
	}
}
