package com.techtalk4geeks.blogspot.Items;

import org.json.JSONException;
import org.json.JSONObject;

import com.techtalk4geeks.blogspot.User;

public class HealingItem extends Item
{
	int myHPChange;
	public HealingItem(String name, int changeHP)
	{
		super(name); 
		myHPChange = changeHP;
	}
	
	public void change(User user) {
		user.healHP(myHPChange);
	}
	
	@Override
	public JSONObject toJSON() throws JSONException
	{
		JSONObject result = super.toJSON();
		result.put("myHPChange", myHPChange);
		return result;
	}
}
