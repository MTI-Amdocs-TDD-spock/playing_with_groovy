a = 8
b = 4
if(a < b){
    println("a is smaller")

}else if( a > b){
    println("a is larger")
}

println("\niterating i++")
for(i=0; i<10; i++){
    println "\tprinting ${i+1} times"
}

println("iterating rang")
for(i in (0..9)){
    println "\tprinting ${i+1} times"
}

list = ["one", 2, "three"]
println("\niterating over list values")

for(i in list){
    println "\t${i}"
}