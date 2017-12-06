package jdte.friendmatch.api.pojo;

import java.io.Serializable;

/**
 * 
* @ClassName: UserPO
* @Description: 问卷实体类
* @author lsl 
* @date 2017/12/02
* @version V1.0 
* 
* zhangmeng0725修改于2017/12/03
 */
public class UserPO implements Serializable{
	
	/**
	* @Fields serialVersionUID : 序列化Id
	*/
	private static final long serialVersionUID = 3570065877578584274L;
	
	private Integer phId;			   //数据库主键
	private String phName;             //用户姓名
	private Integer phSex;             //用户性别
	private Integer phTimetag;   	   //入职时间
	private Integer phArea;    		   //租房区域
	private Integer phDiffsex;		   //是否接受异性混住
    private Integer phSingle;		   //接受合租者有对象
    private Integer phSameroom;		   //
    private Integer phSubway;		   //接受地铁15分钟内
    private Integer phRide;			   //接受步行/骑行15分钟内
    private Integer phPrice;		   //价格
    private Integer phCenter;		   //距离市区距离
    private Integer phAnimal;	       //接受爱心宠物师
    private Integer phMusic;		   //接受音乐人
    private Integer phWorkstation;	   //工作地点
    private Integer phGame;			   //游戏爱好者
    private Integer phTablegame;	   //桌游爱好者{狼人杀、三国杀}
    private Integer phTourism;		   //旅游/摄影爱好者
    private Integer phHealth;		   //健身达人
    private Integer phFood;			   //美食达人
    private Integer phQuiet;		   //安静达人
    private String phSkill;		   	   //个人技能
    private String phQQWechar;		   //个人QQ或微信
    private String phCall;			   //电话
    private Integer phJob;			   //岗位
    private Integer phOpen;  		   //是否公开自己的合租信息给18的其他JDStar
    
    public UserPO(){
    	
    }
    
    
	

	public UserPO(Integer phId, String phName, Integer phSex,
			Integer phTimetag, Integer phArea, Integer phDiffsex,
			Integer phSingle, Integer phSameroom, Integer phSubway,
			Integer phRide, Integer phPrice, Integer phCenter,
			Integer phAnimal, Integer phMusic, Integer phWorkstation,
			Integer phGame, Integer phTablegame, Integer phTourism,
			Integer phHealth, Integer phFood, Integer phQuiet, String phSkill,
			String phQQWechar, String phCall, Integer phJob, Integer phOpen) {
		super();
		this.phId = phId;
		this.phName = phName;
		this.phSex = phSex;
		this.phTimetag = phTimetag;
		this.phArea = phArea;
		this.phDiffsex = phDiffsex;
		this.phSingle = phSingle;
		this.phSameroom = phSameroom;
		this.phSubway = phSubway;
		this.phRide = phRide;
		this.phPrice = phPrice;
		this.phCenter = phCenter;
		this.phAnimal = phAnimal;
		this.phMusic = phMusic;
		this.phWorkstation = phWorkstation;
		this.phGame = phGame;
		this.phTablegame = phTablegame;
		this.phTourism = phTourism;
		this.phHealth = phHealth;
		this.phFood = phFood;
		this.phQuiet = phQuiet;
		this.phSkill = phSkill;
		this.phQQWechar = phQQWechar;
		this.phCall = phCall;
		this.phJob = phJob;
		this.phOpen = phOpen;
	}




	public Integer getPhJob() {
		return phJob;
	}




	public void setPhJob(Integer phJob) {
		this.phJob = phJob;
	}




	public String getPhQQWechar() {
		return phQQWechar;
	}

	public void setPhQQWechar(String phQQWechar) {
		this.phQQWechar = phQQWechar;
	}

	public Integer getPhId() {
		return phId;
	}

	public void setPhId(Integer phId) {
		this.phId = phId;
	}

	public String getPhName() {
		return phName;
	}

	public void setPhName(String phName) {
		this.phName = phName;
	}

	public Integer getPhSex() {
		return phSex;
	}

	public void setPhSex(Integer phSex) {
		this.phSex = phSex;
	}

	public Integer getPhTimetag() {
		return phTimetag;
	}

	public void setPhTimetag(Integer phTimetag) {
		this.phTimetag = phTimetag;
	}

	public Integer getPhArea() {
		return phArea;
	}

	public void setPhArea(Integer phArea) {
		this.phArea = phArea;
	}

	public Integer getPhDiffsex() {
		return phDiffsex;
	}

	public void setPhDiffsex(Integer phDiffsex) {
		this.phDiffsex = phDiffsex;
	}

	public Integer getPhSingle() {
		return phSingle;
	}

	public void setPhSingle(Integer phSingle) {
		this.phSingle = phSingle;
	}

	public Integer getPhSameroom() {
		return phSameroom;
	}

	public void setPhSameroom(Integer phSameroom) {
		this.phSameroom = phSameroom;
	}

	public Integer getPhSubway() {
		return phSubway;
	}

	public void setPhSubway(Integer phSubway) {
		this.phSubway = phSubway;
	}

	public Integer getPhRide() {
		return phRide;
	}

	public void setPhRide(Integer phRide) {
		this.phRide = phRide;
	}

	public Integer getPhPrice() {
		return phPrice;
	}

	public void setPhPrice(Integer phPrice) {
		this.phPrice = phPrice;
	}

	public Integer getPhCenter() {
		return phCenter;
	}

	public void setPhCenter(Integer phCenter) {
		this.phCenter = phCenter;
	}

	public Integer getPhAnimal() {
		return phAnimal;
	}

	public void setPhAnimal(Integer phAnimal) {
		this.phAnimal = phAnimal;
	}

	public Integer getPhMusic() {
		return phMusic;
	}

	public void setPhMusic(Integer phMusic) {
		this.phMusic = phMusic;
	}

	public Integer getPhWorkstation() {
		return phWorkstation;
	}

	public void setPhWorkstation(Integer phWorkstation) {
		this.phWorkstation = phWorkstation;
	}

	public Integer getPhGame() {
		return phGame;
	}

	public void setPhGame(Integer phGame) {
		this.phGame = phGame;
	}

	public Integer getPhTablegame() {
		return phTablegame;
	}

	public void setPhTablegame(Integer phTablegame) {
		this.phTablegame = phTablegame;
	}

	public Integer getPhTourism() {
		return phTourism;
	}

	public void setPhTourism(Integer phTourism) {
		this.phTourism = phTourism;
	}

	public Integer getPhHealth() {
		return phHealth;
	}

	public void setPhHealth(Integer phHealth) {
		this.phHealth = phHealth;
	}

	public Integer getPhFood() {
		return phFood;
	}

	public void setPhFood(Integer phFood) {
		this.phFood = phFood;
	}

	public Integer getPhQuiet() {
		return phQuiet;
	}

	public void setPhQuiet(Integer phQuiet) {
		this.phQuiet = phQuiet;
	}

	public String getPhSkill() {
		return phSkill;
	}

	public void setPhSkill(String phSkill) {
		this.phSkill = phSkill;
	}

	public String getPhCall() {
		return phCall;
	}

	public void setPhCall(String phCall) {
		this.phCall = phCall;
	}

	public Integer getPhOpen() {
		return phOpen;
	}

	public void setPhOpen(Integer phOpen) {
		this.phOpen = phOpen;
	}



	@Override
	public String toString() {
		return "UserPO [phId=" + phId + ", phName=" + phName + ", phSex="
				+ phSex + ", phTimetag=" + phTimetag + ", phArea=" + phArea
				+ ", phDiffsex=" + phDiffsex + ", phSingle=" + phSingle
				+ ", phSameroom=" + phSameroom + ", phSubway=" + phSubway
				+ ", phRide=" + phRide + ", phPrice=" + phPrice + ", phCenter="
				+ phCenter + ", phAnimal=" + phAnimal + ", phMusic=" + phMusic
				+ ", phWorkstation=" + phWorkstation + ", phGame=" + phGame
				+ ", phTablegame=" + phTablegame + ", phTourism=" + phTourism
				+ ", phHealth=" + phHealth + ", phFood=" + phFood
				+ ", phQuiet=" + phQuiet + ", phSkill=" + phSkill
				+ ", phQQWechar=" + phQQWechar + ", phCall=" + phCall
				+ ", phOpen=" + phOpen + ", getPhQQWechar()=" + getPhQQWechar()
				+ ", getPhId()=" + getPhId() + ", getPhName()=" + getPhName()
				+ ", getPhSex()=" + getPhSex() + ", getPhTimetag()="
				+ getPhTimetag() + ", getPhArea()=" + getPhArea()
				+ ", getPhDiffsex()=" + getPhDiffsex() + ", getPhSingle()="
				+ getPhSingle() + ", getPhSameroom()=" + getPhSameroom()
				+ ", getPhSubway()=" + getPhSubway() + ", getPhRide()="
				+ getPhRide() + ", getPhPrice()=" + getPhPrice()
				+ ", getPhCenter()=" + getPhCenter() + ", getPhAnimal()="
				+ getPhAnimal() + ", getPhMusic()=" + getPhMusic()
				+ ", getPhWorkstation()=" + getPhWorkstation()
				+ ", getPhGame()=" + getPhGame() + ", getPhTablegame()="
				+ getPhTablegame() + ", getPhTourism()=" + getPhTourism()
				+ ", getPhHealth()=" + getPhHealth() + ", getPhFood()="
				+ getPhFood() + ", getPhQuiet()=" + getPhQuiet()
				+ ", getPhSkill()=" + getPhSkill() + ", getPhCall()="
				+ getPhCall() + ", getPhOpen()=" + getPhOpen()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + "]";
	}
	
	
}
