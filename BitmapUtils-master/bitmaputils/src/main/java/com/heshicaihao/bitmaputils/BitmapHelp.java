package com.heshicaihao.bitmaputils;

import android.content.Context;

/**
 * Author: wyouflf Date: 13-11-12 Time: 上午10:24
 */
public class BitmapHelp {

	private static BitmapUtils bitmapUtils;
	private static int maxMemory = (int) Runtime.getRuntime().maxMemory();
	private static int cacheSize = maxMemory / 4;
	private static int memoryCacheSize = cacheSize;
	private static int diskCacheSize = 1024 * 1024 * 200;
//	private static String cachePath = FileUtil.getSDPath() + "/"
//			+ MyConstants.CACHE_DIR;
	private static String cachePath = null;
	
	private BitmapHelp() {
	}

	/**
	 * BitmapUtils不是单例的 根据需要重载多个获取实例的方法
	 * 
	 * @param appContext
	 *            application context
	 * @return
	 */
	public static BitmapUtils getBitmapUtils(Context appContext) {
		if (bitmapUtils == null) {
			bitmapUtils = new BitmapUtils(appContext, cachePath,
					memoryCacheSize, diskCacheSize);
		}
		return bitmapUtils;
	}
	
	/**
	 * BitmapUtils不是单例的 根据需要重载多个获取实例的方法
	 * 
	 * @param appContext
	 *            application context
	 * @return
	 */
	public static BitmapUtils getBitmapUtils(Context appContext,String cachePath2 ) {
		if (bitmapUtils == null) {
			bitmapUtils = new BitmapUtils(appContext);
		}
		return bitmapUtils;
	}
}
