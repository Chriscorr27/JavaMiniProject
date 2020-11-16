package OO_RestMenu;

import java.io.*;

public class RenameFile {

	String OUser,OPass,NUser,NPass1,NPass2;
	RenameFile(String OU,String OP,String NU,String NP1,String NP2)
	{
		this.OUser=OU;
		this.OPass=OP;
		this.NUser=NU;
		this.NPass1 = NP1;
		this.NPass2=NP2;
	}
	public  void Rename() throws Exception
	{
		File f = new File("UserInfo.bin");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserInfo us = (UserInfo)ois.readObject();
		ois.close();
		fis.close();
		if(this.OUser.equals(us.username) && this.OPass.equals(us.password)) 
		{
			
			if(NUser.equals("")||NPass1.equals("")||NPass2.equals(""))
			{
				throw new Exception("NEW USERNAME OR PASSWORD IS EMPTY");
			}
			else {
				if(NPass1.equals(NPass2))
				{
					if(f.delete())
					{
						File f1 = new File("UserInfo.bin");
						f1.createNewFile();
						UserInfo u = new UserInfo(NUser,NPass1);
						FileOutputStream fos = new FileOutputStream(f1);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(u);
						oos.close();
						fos.close();
					}
					else
					{
						throw new Exception("Error");
					}
				}
				else
					throw new Exception("Passwords does not match");
			}
		}
		else
		{
			throw new Exception("UserName and Password Does not Match");
		}
	}
}
