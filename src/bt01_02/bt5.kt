//Tính tổng 3 số nguyên nhập từ bàn
package bt01_02

fun main(){
    var sum=0
    for(i in 1..3){
        print("nhập số thứ $i ")
        var a=readLine()!!.toInt()
        sum+=a
    }
    print("tổng 3 số nguyên là: $sum")
}