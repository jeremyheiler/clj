# clj

A set of shell scripts that give you quick access to a full Clojure environment.

## clj

The `clj` command executes Clojure's main method `clojure.main` and passes along any arg
uments you provide. Type `clj -h` to see how it can be used.

## clj-repl

The `clj-repl` command launches a Clojure REPL with `rlwrap`. It is equivalent to `rlwrap clj`. It currently does not accept any arguments.

## clj-env

The `clj-env` command is used by the other two commands, but can also be used independently. It's meant to make it easy to download Clojure jars and map them into a directory for other programs to access.

`install 1.8.0` - Installs the specified version of Clojure.

`set 1.8.0` - Sets the specified version of Clojure to be the default.

`path` - Prints the path to the default version of Clojure.

`path 1.8.0` - Prints the path to the specified version of Clojure.
