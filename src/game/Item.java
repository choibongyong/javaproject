package game;

public class Item {
	private String _name;
	private int _itemCode;
	private int _itemCount;
	private long _guid;

	public Item(String name, int itemCode, int itemCount, int guid) {
		_name = name;
		_itemCode = itemCode;
		_itemCount = itemCount;
		_guid = guid;
	}

}
