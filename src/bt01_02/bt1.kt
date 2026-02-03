// Giải phương trình
package bt01_02

fun giaipt(a:Double, b:Double){
    when{
        (a!= 0.0 && b!=0.0) ->{
          val x=-b/a
            print("=> Nghiệm của phương trình là x=$x")
        }
        b==0.0 ->{
            print("=> Phương trình có vô số nghiệm")
        }
        else ->{
            print("=> Phương trình vô nghiệm")
        }
    }
}
fun main(){
    println("Phương trình có dạng ax + b = 0")
    print("Nhập giá trị của a: ")
    val a = readLine()?.toDoubleOrNull() ?:0.0
    print("Nhập giá trị của b: ")
    val b = readLine()?.toDoubleOrNull() ?:0.0
    giaipt(a,b)
}