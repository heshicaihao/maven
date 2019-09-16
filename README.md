这是自己项目远程代码仓库

自己maven

https://raw.githubusercontent.com/heshicaihao/maven/master


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


fastjson 阿里json工具1.2.60

https://github.com/heshicaihao/fastjson.git


update Android App 更新库

https://github.com/heshicaihao/update.git


badge Android 应用桌面 Logo 添加数字提醒

https://github.com/heshicaihao/badge.git


utils 工具包

https://github.com/heshicaihao/utils.git


calendar 日历控件

https://github.com/heshicaihao/calendar.git


autograph 手写签名板

https://github.com/heshicaihao/autograph.git


net 网络请求 解析

https://github.com/heshicaihao/net.git


photopicker 图片选择浏览

https://github.com/heshicaihao/photopicker.git


zxing 二维码包

https://github.com/heshicaihao/zxing.git


screenadapter 屏幕适配工具

https://github.com/heshicaihao/screenadapter.git


camera 相机开发适配工具

https://github.com/heshicaihao/camera.git


bitmaputils 图片加载工具

https://github.com/heshicaihao/bitmaputils.git




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////// 打包cmd命令////////

E:

cd E:\workspace\photopicker.git\trunk\PhotoPicker-master

gradlew uploadArchives


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////// 打包发布配置开始 ////////

apply plugin: 'maven'

ext {

    // 从Github上clone下来的项目的本地地址
	
    //这里指定的就是刚刚新建项目后clone下来的在本地的路径
	
    GITHUB_REPO_PATH = "E:/Note/maven.git/trunk"
	
	PUBLISH_GROUP_ID = 'com.heshicaihao'
	
    PUBLISH_ARTIFACT_ID = 'net'
	
    PUBLISH_VERSION = '0.0.0'
	
}

uploadArchives {

    repositories.mavenDeployer {
	
        def deployPath = file(project.GITHUB_REPO_PATH)
		
        repository(url: "file://${deployPath.absolutePath}")
		
        pom.project {
		
            groupId project.PUBLISH_GROUP_ID
			
            artifactId project.PUBLISH_ARTIFACT_ID
			
            version project.PUBLISH_VERSION
			
        }
    }
}

// 源代码一起打包
task androidSourcesJar(type: Jar) {

    classifier = 'sources'
	
    from android.sourceSets.main.java.sourceFiles
	
}

artifacts {

    archives androidSourcesJar
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



使用

mavenCentral()

maven { url "https://raw.githubusercontent.com/heshicaihao/maven/master"}

implementation 'com.heshicaihao:zxing:0.0.0'


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

