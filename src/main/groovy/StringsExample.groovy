def louis = "Louise"
def alberta = "Alberta"

println "first time message is:"
println "\t${louis} should not go to ${alberta}"

println "changed the value of 'louis' to 5"
louis = 5

println "\tIT WAS A STRING NOT A MINUTE AGO!!!!\n"
println "after re-assignment time message is:"
println "\t${louis} should not go to ${alberta}"

//Can access the String methods directly from string
println "This is 20 char long".size()

//evaluting code can go in concatination
println "this tested string is ${"This is 20 char long".size()} long\n"