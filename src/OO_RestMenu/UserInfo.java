package OO_RestMenu;

import java.io.*;

public class UserInfo implements Serializable{
	String username,password;
	UserInfo(String U,String P)
	{
		this.username=U;
		this.password=P;
	}
}
