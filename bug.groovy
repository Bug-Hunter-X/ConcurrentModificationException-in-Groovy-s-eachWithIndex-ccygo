```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (index > 2) {
       list.remove(item) // ConcurrentModificationException here
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd', 'e']
myMethod(myList)
```