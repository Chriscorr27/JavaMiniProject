package OO_RestMenu;

import java.io.*;

public class LoginClass {
	String UserName,Password;
	LoginClass(String U,String P)
	{
		this.UserName=U;
		this.Password=P;
	}
	public void Login() throws Exception
	{
		File f = new File("UserInfo.bin");
		if(!f.exists())
		{
			f.createNewFile();
			UserInfo u= new UserInfo("admin","12345");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(u);
		}
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserInfo us = (UserInfo)ois.readObject();
		if(!us.username.equals(UserName) || !us.password.equals(Password))
		{
			throw new Exception("UserName and Password does not match !!!!");
		}
			
	}
}
