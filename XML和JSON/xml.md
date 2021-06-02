# XML
可扩展标记语言（eXtensible Markup Language）的缩写
## 理解
一种*数据表示格式*，描述数据结构，常用于传输和存储数据。
## 特点
纯文本
##结构
```xml
<?xml version="1.0"?>
<!--版本-->
<!DOCTYPE note SYSTEM "book.dtd">
<!--文档类型-->
<book>
    
    
</book>
<!--        接下来是XML的文档内容-->

```
根元素可以包含任意个子元素，元素可以包含属性，例如，
```xml
<isbn lang="CN">1234567</isbn>
```

##java中解析xml文件
DOM-API  SAX-API Jackson-API（好用，解析为一个javaBean）