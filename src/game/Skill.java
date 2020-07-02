package game;

public class Skill {

	private String _name;
	private String _effect;

	private static int _skillPoint;

	private int _skillCode;

	private int _maxSkill;
	private int _presentSkill;

	public Skill(String name, String effect, int skillPoint, int skillCode) {
		_name = name;
		_effect = effect;
		_skillPoint = skillPoint;
		_skillCode = skillCode;

		_maxSkill = 10;
		_presentSkill = 0;
	}

	public String getname() {
		return _name;
	}

	public String geteffect() {
		return _effect;
	}

	public void setname(String name, String effect, int skillCode) {
		_name = name;
		_effect = effect;
		_skillCode = skillCode;
	} /* ĳ���� ���� ��¿� ���� ���ο� ��ų��� */

	public static void SkillPointUp() {
		_skillPoint++;
	}

//	private boolean SkillLevelUp() {
//		_skillCode ++;
//	}

	private boolean SkillLevelUp(int skillPoint) {

		if (!isSkillLevel())
			return false;

		_presentSkill++;
		_skillPoint--;

		_presentSkill += skillPoint;

		System.out.println("SkillLevel�� ����߽��ϴ�.");
		return true;
	}

	private boolean SkillLevelDown(int skillPoint) {

		if (!isSkillLevel())
			return false;

		_presentSkill--;
		_skillPoint++;

		_presentSkill = skillPoint;

		System.out.println("SkillLevel�� �����߽��ϴ�.");
		return true;
	}

	private boolean isSkillLevel() {
		if (_maxSkill - _presentSkill < 0) {
			System.out.println(" X : ���̻� SkillPoint�� ���� �� �����ϴ�.");
			return false;
		} else if (_presentSkill < 0) {
			System.out.println("X : ���̻� SkillPoint�� ���� �� �����ϴ�.");
			return false;
		}
		return true;
	}

	public static Skill createSkill(String name, String effect, int skillCode) {
		return new Skill(name, effect, skillCode, skillCode);
	}


}
