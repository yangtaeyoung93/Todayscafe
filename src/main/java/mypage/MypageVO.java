package mypage;

public class MypageVO {
	
	private String userid,userpwd,email,dbimgpath,filename,admin,authstatus;

	public MypageVO() {}
	
	public MypageVO(String userid, String userpwd, String email, String dbimgpath, String filename, String admin, String authstatus) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.email = email;
		this.dbimgpath = dbimgpath;
		this.filename = filename;
		this.admin = admin;
		this.authstatus = authstatus;
	}

	
	
	public String getAuthstatus() {
		return authstatus;
	}

	public void setAuthstatus(String authstatus) {
		this.authstatus = authstatus;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDbimgpath() {
		return dbimgpath;
	}

	public void setDbimgpath(String dbimgpath) {
		this.dbimgpath = dbimgpath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
	
}
