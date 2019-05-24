// metaprogramming
String.metaClass.csv = {sep = ',' ->
  // println delegate // very much like `this`
  delegate.toList().join(sep)
}


def name = 'mehul chopra'
println name.csv()


List.metaClass.pushx = {element ->
  delegate << element
}

def nos = ['audi', 'bmw']
nos.pushx('porshe')

println nos
