package game;

import java.util.HashMap;

public class SkillManager {

	private HashMap _SkillMap = new HashMap();

	public SkillManager() {
		init_skill();
	}

	private void init_skill() {
		_SkillMap.put(Skilldef.ATTACK, "attack");
		_SkillMap.put(Skilldef.POWER_ATTACK, "power_attack");
		_SkillMap.put(Skilldef.THROWING, "throwing");
	}

	public Skill createSkill(int SkillCode, String effect) {
		Object SkillNameObj = _SkillMap.get(SkillCode);
		if (SkillNameObj == null)
			return null;

		return Skill.createSkill((String) SkillNameObj, effect, SkillCode);
	}

}
