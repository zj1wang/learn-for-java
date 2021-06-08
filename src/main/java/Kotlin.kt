
//本质：
/*
Kotlin 是一个基于 JVM 的新的编程语言，由 JetBrains 开发。 编译为java或者js
* */
class Kotlin {
    //定义函数
    fun sum(a: Int, b: String): String {
        return ""
    }

    fun sum2(vararg v: Int) {
        for (vt in v) {
            vt
        }
    }

    //变量和常量
    var a: Int = 0;
    val b: Int = 0;//final

    //字符串模板
    public fun main() {
        var c = "sss";
        val d = "${a}ahhaha"
    }
    //null检查
    //类型检测 instanceof
    fun max(obj:Any){
        if(obj is String){
            return
        }
    }
    //区间

}