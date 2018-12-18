# TAGS

[![Download](https://api.bintray.com/packages/zhangliang/android/tags/images/download.svg)](https://bintray.com/zhangliang/android/tags/_latestVersion)

# 前言

这是从[AndroidTagGroup](https://github.com/2dxgujun/AndroidTagGroup) Fork的项目，在其基础上，做了部分修改

* 增加了可选中模式。目前模式有三种：展示、可选、修改。
* 增加了部分对外接口。

# 使用

## Step 1

#### Gradle
```groovy
dependencies {
   implementation 'com.liang.android:tags:0.9.0'
}
```

#### Maven
```xml
<dependency>
  <groupId>com.liang.android</groupId>
  <artifactId>tags</artifactId>
  <version>0.9.0</version>
  <type>pom</type>
</dependency>
```

## Step 2

Use it in your own code:
```xml
<com.light.android.taggroup.TagGroup
	android:id="@+id/tag_group_checkable"
	style="@style/TagGroup"/>
```

```kotlin
tag_group_checkable.setMode(TagGroup.Mode.CHECKABLE)
tag_group_checkable.setTags(listof("a", "b", "c"))
tag_group_checkable.setOnTagClickListener {
     Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
 }
```
# 其他

其他说明请见 [AndroidTagGroup](https://github.com/2dxgujun/AndroidTagGroup) 

# Developed By

* Zhang Liang <zhangliangnbu@gmail.com>
* Blog https://zhangliangnbu.github.io

# License

    Copyright 2018 Zhang Liang
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
