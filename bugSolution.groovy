```groovy
def myMethodSafe(List<String> list) {
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    println "Item: $item"
    if (item == 'c') {
      iterator.remove()
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd', 'e']
myMethodSafe(myList)
println myList // Output: [a, b, d, e]

//Alternative solution creating a new list
def myMethodSafe2(List<String> list) {
  List<String> newList = []
  list.each { item ->
    if (item != 'c') {
      newList << item
    }
  }
  println newList
}
myMethodSafe2(myList)
```