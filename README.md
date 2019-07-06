bitmaputils
自己封装的图片加载工具包

更新AndroidStudio 版的
此工具中使用了useLibrary 'org.apache.http.legacy'
已内置不用再添加其他

使用方法

在工程中build.gradle 加入

    repositories {
        google()
        jcenter()
        mavenCentral() //项目引用代码库
        
    }
    
    
    repositories {
        google()
        jcenter()
        maven { url "https://raw.githubusercontent.com/heshicaihao/bitmaputils/master"}//项目引用地址
        
    }
    
    在application 中使用
    
    implementation 'com.heshicaihao:bitmaputils:2.0.0'
    
    
BitmapUtils 使用方法
BitmapUtils bitmapUtils = new BitmapUtils(this);

// 加载网络图片
bitmapUtils.display(testImageView, "http://bbs.lidroid.com/static/image/common/logo.png");

// 加载本地图片(路径以/开头， 绝对路径)
bitmapUtils.display(testImageView, "/sdcard/test.jpg");

// 加载assets中的图片(路径以assets开头)
bitmapUtils.display(testImageView, "assets/img/wallpaper.jpg");

// 使用ListView等容器展示图片时可通过PauseOnScrollListener控制滑动和快速滑动过程中时候暂停加载图片
listView.setOnScrollListener(new PauseOnScrollListener(bitmapUtils, false, true));
listView.setOnScrollListener(new PauseOnScrollListener(bitmapUtils, false, true, customListener));
    
