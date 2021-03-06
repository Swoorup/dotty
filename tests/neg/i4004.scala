@main def Test =
  "a".isInstanceOf[Null] // error
  null.isInstanceOf[Null] // error
  "a".isInstanceOf[Nothing] // error
  "a".isInstanceOf[Singleton] // error

  "a" match
  case _: Null => () // error
  case _: Nothing => () // error
  case _: Singleton => () // error
  case _ => ()

  null match
  case _: Null => () // error
  case _ => ()

