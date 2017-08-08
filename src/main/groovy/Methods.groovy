// Declaration order is not important!
testingMethods()

def testingMethods(aType){
    println("Gochha")
}

def testingPassingTypes(aType){
    println("We are now testing a type of ${aType.getClass().toString()}")
}
"Passing string".println()
testingPassingTypes("A string")
testingPassingTypes(new Boolean("false"))
testingPassingTypes(4)
testingPassingTypes(44.44)
