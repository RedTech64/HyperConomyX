package regalowl.hyperconomy.display;

public enum SignObject {
	TRADEOBJECT, ACCOUNT, TRADEOBJECTLIST, ACCOUNTLIST, TAX, NONE;

	public static SignObject fromString(String type) {
		if (type == null) {
			return SignObject.NONE;
		}
		type = type.toUpperCase();
		if (type == null) {
			return null;
		} else if ("BUY,SELL,STOCK,TOTALSTOCK,VALUE,STATUS,STATICPRICE,STARTPRICE,MEDIAN,CHANGE,PRODUCTTAX,SB".contains(type)) {
			return SignObject.TRADEOBJECT;
		} else if ("BALANCE".contains(type)) {
			return SignObject.ACCOUNT;
		} else if ("TOPSTOCK,TOPTOTALSTOCK,TOPVALUE,TOPBUY,TOPSELL,TOPPRODUCTTAX,TOPMEDIAN,TOPSTATICPRICE,TOPSTARTPRICE,TOPCHANGE".contains(type)) {
			return SignObject.TRADEOBJECTLIST;
		} else if ("TOPBALANCE".contains(type)) {
			return SignObject.ACCOUNTLIST;
		} else if ("TAX".contains(type)) {
			return SignObject.TAX;
		} else {
			return SignObject.NONE;
		}
	}
}