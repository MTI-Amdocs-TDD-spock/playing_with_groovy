import groovyjarjarantlr.collections.impl.ASTArray

//Can hold any object
def hetrogenous = [1, "Wow", 3, new ASTArray(9), "So divers"]

println "${hetrogenous.toString()} List toString()"

// This equals #add()
hetrogenous << "Just added this"
println "${hetrogenous.toString()} List toString()"

hetrogenous.add("Just added this using #add()")
println "${hetrogenous.toString()} List toString()"

hetrogenous.removeIf {it instanceof ASTArray}
println "${hetrogenous.toString()} List toString()"
println("removed the ASTArray instance")