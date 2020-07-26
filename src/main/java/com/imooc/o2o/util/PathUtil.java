package com.imooc.o2o.util;

public class PathUtil {
	private static String seperator = "/"; 
	
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "E:/photon-workspace/image";
		} else {
			basePath = "/Users/baidu/work/image";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/images/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
	public static String getHeadLineImagePath() {
		String imagePath = "/upload/images/item/headtitle/";
		return imagePath.replace("/", seperator);
	}
	public static String getShopCategoryPath() {
		String imagePath = "/upload/images/item/shopcategory/";
		return imagePath.replace("/", seperator);
	}
}
