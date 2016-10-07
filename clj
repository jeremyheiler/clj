#!/bin/bash

# TODO
#
# - POSIX only?
# - Don't hardcode the location of the Clojure jar
#   - Could have a `-v 1.6.0` so the jar can be downloaded and cached
# - Allow for all of the expected arguments to clojure.main
# - Allow for the classpath to be set as an argument

readonly CLJ_HOME=$HOME/.clj

case $1 in
    repl)
        rlwrap java -cp $CLJ_HOME/clojure-1.8.0/clojure-1.8.0.jar clojure.main
        ;;
    *)
        echo "Usage: clj repl"
        ;;
esac
