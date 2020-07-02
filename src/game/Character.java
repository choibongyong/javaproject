package game;

import java.util.ArrayList;

public class Character {
	private String _name;
	private int _level;
	private int _hp;
	private int _mp;
	
	private ArrayList<Skill> _skills;
	private ArrayList<Item> _items;
	private long _guid;

	public Character(String name, long guid) {
		_name = name;
		_level = 1;
		_hp = 50;
		_mp = 50;
		
		_skills = new ArrayList<Skill>();
		_items = new ArrayList<Item>();
		_guid = guid;
	}

	public void Levelup () {
		_level ++;
		_hp += 100;
		_mp += 100;
		//Skill.SkillPointUp();
	}
	
//	public int LevelCheck() {
//		if((_level % 10) == 0);
//	}
	
	private boolean isNameCheck(String name) {
		if(_name.equals(name)) {
			System.out.println("아이디가 중복입니다.");
			return false;
		}
		
		return true;
	}
	
	public boolean removeitem(long guid) {
		return true;
	}
	
	

}
