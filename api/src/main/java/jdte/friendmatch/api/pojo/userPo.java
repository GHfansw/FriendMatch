public class userPo {
	/*���캯���ȵĶ��� by lsl 2017/12/2*/
	public userPo(int id, String name,int sex,int timetag,int area,
			int diffsex, int single,int sameroom,int subway,int ride,
			int price,int center,int animal,int music,int workstation,
			int game,int tablegame,int toursim,int health,int food,int
			quiet,int skill,int call,int open)
	{
		this.ph_id   = id;
		this.ph_name = name;
		this.ph_sex  = sex;
		this.ph_timetag = timetag;
		this.ph_area    = area;
		this.ph_diffsex = diffsex;
		this.ph_single  = single;
		this.ph_sameroom = sameroom;
		this.ph_subway  = subway;
		this.ph_ride    = ride;
		this.ph_price   = price;
		this.ph_center  = center;
		this.ph_animal  = animal;
		this.ph_music   = music;
		this.ph_workstation = workstation;
		this.ph_game    = game;
		this.ph_tablegame = tablegame;
		this.ph_tourism = toursim;
		this.ph_health  = health;
		this.ph_food    = food;
		this.ph_quiet   = quiet;
		this.ph_skill   = skill;
		this.ph_call    = call;
		this.ph_open    = open;
	}
	
	
	/*��Ա����definition by lsl 2017/12/2*/
	private int ph_id;					//����
	private String ph_name;             //����
	private int ph_sex;                 //�Ա�
	private int ph_timetag;   		    //��ְʱ��
	private int ph_area;    		    //�ⷿ����
	private int ph_diffsex;				//�������Ի���
    private int ph_single;				//
    private int ph_sameroom;		    //
    private int ph_subway;				//
    private int ph_ride;				//
    private int ph_price;				//�۸�
    private int ph_center;				//
    private int ph_animal;				//���ܰ��ĳ���ʦ
    private int ph_music;				//����������
    private int ph_workstation;			//�����ص�
    private int ph_game;				//��Ϸ������
    private int ph_tablegame;			//���ΰ�����{����ɱ������ɱ}
    private int ph_tourism;				//����/��Ӱ������
    private int ph_health;				//�������
    private int ph_food;				//��ʳ����
    private int ph_quiet;				//��������
    private int ph_skill;				//���˼���
    private int ph_call;				//�绰
    private int ph_open;  				//�Ƿ񹫿��Լ��ĺ�����Ϣ��18������JDStar
	/*��Ա����definition by lsl 2017/12/2*/
    public int getPh_id()
    {
    	return this.ph_id;
    }
    public void setPh_id(int ph_id)
    {
    	this.ph_id = ph_id;
    }
    public String getPh_name()
    {
    	return this.ph_name;
    }
    public void setPh_name(String ph_name)
    {
    	this.ph_name = ph_name;
    }
    public int getPh_sex()
    {
    	return this.ph_sex;
    }
    public void setPh_sex(int ph_sex)
    {
    	this.ph_sex = ph_sex;
    }
    public int getPh_timetag()
    {
    	return this.ph_timetag;
    }
    public void setPh_timetag(int ph_timetag)
    {
    	this.ph_timetag = ph_timetag;
    }
    public int getPh_area()
    {
    	return this.ph_area;
    }
    public void setPh_area(int ph_area)
    {
    	this.ph_area = ph_area;
    }
    public int getPh_diffsex()
    {
    	return this.ph_diffsex;
    }
    public void setPh_diffsex(int ph_diffsex)
    {
    	this.ph_diffsex = ph_diffsex;
    }
    public int getPh_single()
    {
    	return this.ph_single;
    }
    public void setPh_single(int ph_single)
    {
    	this.ph_single = ph_single;
    }
    public int getPh_sameroom()
    {
    	return this.ph_sameroom;
    }
    public void setPh_sameroom(int ph_sameroom)
    {
    	this.ph_sameroom = ph_sameroom;
    }
    public int getPh_subway()
    {
    	return this.ph_subway;
    }
    public void setPh_subway(int ph_subway)
    {
    	this.ph_subway = ph_subway;
    }
    public int getPh_ride()
    {
    	return this.ph_ride;
    }
    public void setPh_ride(int ph_ride)
    {
    	this.ph_ride = ph_ride;
    }
    public int getPh_price()
    {
    	return this.ph_price;
    }
    public void setPh_price(int ph_price)
    {
    	this.ph_price = ph_price;
    }
    public int getPh_center()
    {
    	return this.ph_center;
    }
    public void setPh_center(int ph_center)
    {
    	this.ph_center = ph_center;
    }
    public int getPh_animal()
    {
    	return this.ph_animal;
    }
    public void setPh_animal(int ph_animal)
    {
    	this.ph_animal = ph_animal;
    }
    public int getPh_music()
    {
    	return this.ph_music;
    }
    public void setPh_music(int ph_music)
    {
    	this.ph_music = ph_music;
    }
    public int getPh_workstation()
    {
    	return this.ph_workstation;
    }
    public void setPh_workstation(int ph_workstation)
    {
    	this.ph_workstation = ph_workstation;
    }
    public int getPh_game()
    {
    	return this.ph_game;
    }
    public void setPh_game(int ph_game)
    {
    	this.ph_game = ph_game;
    }
    public int getPh_tablegame()
    {
    	return this.ph_tablegame;
    }
    public void setPh_tablegame(int ph_tablegame)
    {
    	this.ph_tablegame = ph_tablegame;
    }
    public int getPh_tourism()
    {
    	return this.ph_tourism;
    }
    public void setPh_toursim(int ph_tourism)
    {
    	this.ph_tourism = ph_tourism;
    }
    public int getPh_health()
    {
    	return this.ph_health;
    }
    public void setPh_health(int ph_health)
    {
    	this.ph_health = ph_health;
    }
    public int getPh_food()
    {
    	return this.ph_food;
    }
    public void setPh_food(int ph_food)
    {
    	this.ph_food = ph_food;
    }
    public int getPh_quiet()
    {
    	return this.ph_quiet;
    }
    public void setPh_quiet(int ph_quiet)
    {
    	this.ph_quiet = ph_quiet;
    }
    public int getPh_skill()
    {
    	return this.ph_skill;
    }
    public void setPh_skill(int ph_skill)
    {
    	this.ph_skill = ph_skill;
    }
    public int getPh_call()
    {
    	return this.ph_call;
    }
    public void setPh_call(int ph_call)
    {
    	this.ph_call = ph_call;
    }
    public int getPh_open()
    {
    	return this.ph_open;
    }
    public void setPh_open(int ph_open)
    {
    	this.ph_open = ph_open;
    }
}

